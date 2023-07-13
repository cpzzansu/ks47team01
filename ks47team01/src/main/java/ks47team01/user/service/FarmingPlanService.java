package ks47team01.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.CropsGrowingInfo;
import ks47team01.common.dto.FarmingPlan;
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
	public void addCrops(String cropsNameCode, String urbanKitCode, HttpSession session) {
		String urbanfarmerId = (String)session.getAttribute("SID");
		String increseCode = farmingPlanMapper.getIncreseFarmingPlanCode();
		Map<String, Object> crewMap = farmingPlanMapper.getMinManagementUser();
		String hubCrewId = (String)crewMap.get("min_crew_id");
		CropsGrowingInfo cropsGrowingInfo = cropsGrowingInfoMapper.getCropsGrowingInfoByCode(cropsNameCode);
		String cropsName = cropsGrowingInfo.getCropsName();
		String cropsGrowingInfoCode = cropsGrowingInfo.getCropsGrowingInfoCode();
		
		FarmingPlan farmingPlan = new FarmingPlan();
		farmingPlan.setFarmerFarmingPlanCode(increseCode);
		farmingPlan.setUrbanfarmerId(urbanfarmerId);
		farmingPlan.setUrbanKitCode(urbanKitCode);
		farmingPlan.setUrbanfarmHubCrewId(hubCrewId);
		farmingPlan.setCropsNameCode(cropsNameCode);
		farmingPlan.setCropsName(cropsName);
		farmingPlan.setCropsGrowingInfoCode(cropsGrowingInfoCode);
		
		farmingPlanMapper.addCrops(farmingPlan);
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
}
