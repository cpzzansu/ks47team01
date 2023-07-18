package ks47team01.user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.CropsGrowingInfo;
import ks47team01.common.dto.FarmingPlan;
import ks47team01.common.dto.FarmingPlanLargeCate;
import ks47team01.user.mapper.CropsGrowingInfoMapper;
import ks47team01.user.mapper.CropsNameMapper;
import ks47team01.user.mapper.FarmingPlanMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Transactional
@AllArgsConstructor
@Service
@Log4j2
public class FarmingPlanService {
	private final CropsNameMapper cropsNameMapper;
	private final FarmingPlanMapper farmingPlanMapper;
	private final CropsGrowingInfoMapper cropsGrowingInfoMapper;
	
	/**
	 * 사용자의 작물 등록
	 * @param cropsNameCode
	 * @param urbanKitCode
	 */
	public void addCrops(String cropsNameCode, String urbanKitCode, String farmerFarmingPlanNickname, HttpSession session) {
		String urbanfarmerId = (String)session.getAttribute("S_id");
		String increseCode = farmingPlanMapper.autoIncreaseCode("farmer_farming_plan");
		
		Map<String, Object> crewMap = farmingPlanMapper.getMinManagementUser();
		String hubCrewId = (String)crewMap.get("min_crew_id");
		
		
		Map<String, Object> farmingPlanMap = new HashMap();
		farmingPlanMap.put("farmerFarmingPlanCode", increseCode);
		farmingPlanMap.put("urbanfarmerId", urbanfarmerId);
		farmingPlanMap.put("farmerFarmingPlanNickname", farmerFarmingPlanNickname);
		farmingPlanMap.put("urbanKitCode", urbanKitCode);
		farmingPlanMap.put("urbanfarmHubCrewId", hubCrewId);
		farmingPlanMap.put("cropsNameCode", cropsNameCode);
		farmingPlanMapper.addCrops(farmingPlanMap);
		
	}
	
	/**
	 * 사용자별 작물 리스트
	 * @param userId
	 * @return farmerFarmingPlanCode, cropsName, farmerFarmingPlanStatus
	 */
	public List<FarmingPlan> getFarmingPlanListById(String userId){
		List<FarmingPlan> farmingPlanList = farmingPlanMapper.getFarmingPlanListById(userId);
		log.info(farmingPlanList);
		String autoCode = farmingPlanMapper.autoIncreaseCode("farming_detail_plan_action");
		System.out.println(autoCode);
		return farmingPlanList;
	}
	
	/**
	 * 코드별 작농계획
	 * @param farmerFarmingPlanCode
	 * @return FarmingPlan farmingPlan
	 */
	public FarmingPlan getFarmingPlanByCode(String farmerFarmingPlanCode) {
		FarmingPlan farmingPlan = farmingPlanMapper.getFarmingPlanByCode(farmerFarmingPlanCode);
		return farmingPlan;
	}
	
	
	/**
	 * 코드별 대분류 조회
	 * @param farmerFarmingPlanCode
	 * @return List<FarmingPlanLargeCate> farmingPlanLargeCateList
	 */
	public List<FarmingPlanLargeCate> getFarmingLargeCateByCode(String farmerFarmingPlanCode) {
		List<FarmingPlanLargeCate> farmingPlanLargeCateList = farmingPlanMapper.getFarmingLargeCateByCode(farmerFarmingPlanCode);
		return farmingPlanLargeCateList;
	}
}
