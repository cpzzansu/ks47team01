package ks47team01.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.FarmingDetailPlan;
import ks47team01.common.dto.FarmingDetailPlanAction;
import ks47team01.common.dto.FarmingPlan;
import ks47team01.common.dto.FarmingPlanLargeCate;
import ks47team01.common.dto.FarmingPlanSmallCate;
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
	 * 계획 실행
	 * 실행한 계획List를 받아 insert
	 * @param planActionList
	 */
	//@Transactional(isolation = Isolation.SERIALIZABLE)
	public void insertPlanAction(List<String> planActionList) {
		String detailPlanCode = null;
		FarmingDetailPlan farmingDetailPlan= null;
		FarmingDetailPlanAction farmingDetailPlanAction = null;
		List<FarmingDetailPlanAction> farmingDetailPlanActionList = new ArrayList<>();
		boolean isFirst = true;
		String urbanFarmerId = null;
		String farmerFarmingPlanCode = null;
		String farmerFarmingDetailPlanCode = null;
		String cropsGrowingInfoCode = null;
		String farmingPlanLargeCateCode = null;
		
		
		//insert할 테이블의 자동증가코드
		String increaseCode = farmingPlanMapper.autoIncreaseCode("farming_detail_plan_action");
		System.out.println(increaseCode+"테스트트");
		int subIndex = increaseCode.lastIndexOf("_");
		String prefixCode = increaseCode.substring(0,subIndex+1);
		int suffixNum = Integer.parseInt(increaseCode.substring(subIndex+1,increaseCode.length()));
		
		for(String planAction : planActionList) {
			System.out.println(planAction+"테스트");
			if(isFirst) {
				detailPlanCode = planAction;
				//detailPlanCode 한줄 조회
				farmingDetailPlan = farmingPlanMapper.getDetailPlanByCode(detailPlanCode);
				isFirst = false;
				urbanFarmerId = farmingDetailPlan.getUrbanfamerId();
				farmerFarmingPlanCode = farmingDetailPlan.getFarmerFarmingPlanCode();
				farmerFarmingDetailPlanCode = farmingDetailPlan.getFarmerFarmingDetailPlanCode();
				cropsGrowingInfoCode = farmingDetailPlan.getCropsGrowingInfoCode();
				farmingPlanLargeCateCode = farmingDetailPlan.getFarmingPlanLargeCateCode();
			}else {
				String detailPlanActionCode = prefixCode+suffixNum;
				suffixNum = suffixNum + 1;
				
				farmingDetailPlanAction = new FarmingDetailPlanAction();
				farmingDetailPlanAction.setFarmingDetailPlanActionCode(detailPlanActionCode);
				farmingDetailPlanAction.setUrbanfarmerId(urbanFarmerId);
				farmingDetailPlanAction.setFarmerFarmingPlanCode(farmerFarmingPlanCode);
				farmingDetailPlanAction.setFarmerFarmingDetailPlanCode(farmerFarmingDetailPlanCode);
				farmingDetailPlanAction.setFarmingDetailPlanActionContent(planAction);
				farmingDetailPlanAction.setCropsGrowingInfoCode(cropsGrowingInfoCode);
				farmingDetailPlanAction.setFarmingPlanLargeCateCode(farmingPlanLargeCateCode);
				
				farmingDetailPlanActionList.add(farmingDetailPlanAction);
			}
		}
		
		System.out.println(farmingDetailPlanActionList+"테스트");
		farmingPlanMapper.insertPlanAction(farmingDetailPlanActionList);
		
	};
	
	/**
	 * 오늘의 계획
	 * @param farmingPlanCode
	 * @param fewDays
	 * @return
	 */
	public FarmingDetailPlan getTodayPlan(String farmingPlanCode, int fewDays) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("farmingPlanCode", farmingPlanCode);
		paramMap.put("fewDays", fewDays);
		
		FarmingDetailPlan todayPlan = farmingPlanMapper.getTodayPlan(paramMap);
		return todayPlan;
	}
	
	
	/**
	 * 작물 수정
	 * @param farmingPlan
	 */
	public void updateCrops(FarmingPlan farmingPlan,HttpSession session) {
		String farmerFarmingPlanCode = farmingPlan.getFarmerFarmingPlanCode();
		String cropsNameCode = farmingPlan.getCropsNameCode();
		String nickName = farmingPlan.getFarmerFarmingPlanNickname();
		String urbanKitCode = farmingPlan.getUrbanKitCode();
		
		// 작물or키트 변경시 계획 삭제
		farmingPlanMapper.deleteFarmerFarmingDetailPlanByPlanCode(farmerFarmingPlanCode);
		
		//작물 수정
		if(cropsNameCode ==null && nickName == null && urbanKitCode == null) return;
		farmingPlanMapper.updateCrops(farmingPlan);	
		
		//변경한 작물의 계획 등록
		String urbanfarmerId = (String)session.getAttribute("S_id");
		
		//등록 버튼을 누르면 계획 복사해 사용자에게 등록
		if(cropsNameCode == null) {
			FarmingPlan getFarmingPlan = farmingPlanMapper.getFarmingPlanByCode(farmerFarmingPlanCode);
			cropsNameCode = getFarmingPlan.getCropsNameCode();
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("urbanfarmerId", urbanfarmerId);
		paramMap.put("farmerFarmingPlanCode", farmerFarmingPlanCode);
		paramMap.put("cropsNameCode", cropsNameCode);
		paramMap.put("urbanKitCode", urbanKitCode);
		
		farmingPlanMapper.addPlan(paramMap);
	}
	
	/**
	 * 대분류별 농사계획
	 * farmerFarmingPlanCode,farmingPlanLargeCateCode별 smallCateList
	 * @param farmingPlanLargeCateCode
	 * @return List<FarmingPlanSmallCate>
	 */
	public List<FarmingPlanSmallCate> getFarmingPlanSmallCateListByLargeCateCode(Map paramMap){
		List<FarmingPlanSmallCate> smallCateList = farmingPlanMapper.getFarmingPlanSmallCateListByLargeCateCode(paramMap);
		return smallCateList;
	};
	
	/**
	 * 작농 계획 삭제
	 * farmerFarmingPlanCode별 FarmerFarmingPlan삭제
	 * @param farmerFarmingPlanCode
	 */
	public void deleteFarmerFarmingPlanByPlanCode(String farmerFarmingPlanCode) {
		farmingPlanMapper.deleteFarmingDetailPlanActionByPlanCode(farmerFarmingPlanCode);
		farmingPlanMapper.deleteFarmerFarmingDetailPlanByPlanCode(farmerFarmingPlanCode);
		farmingPlanMapper.deleteFarmerSaleReservationToHubByPlanCode(farmerFarmingPlanCode);
		farmingPlanMapper.deleteFarmerFarmingPlanByPlanCode(farmerFarmingPlanCode);
	}
	
	/**
	 * 작물 한개 정보
	 * @param farmerFarmingPlanCode
	 * @return Map<String, Object> cropsName, farmerFarmingPlanNickname, 
	 */
	public Map<String, Object> getCropsInfo(Map<String, Object> farmerFarmingPlanCode){
		Map<String, Object> cropsInfoMap= farmingPlanMapper.getCropsInfo(farmerFarmingPlanCode);
		return cropsInfoMap;
	}
	
	/**
	 * 사용자의 작물 등록
	 * @param cropsNameCode
	 * @param urbanKitCode
	 */
	public void addCrops(String cropsNameCode, String urbanKitCode, String farmerFarmingPlanNickname, HttpSession session) {
		String urbanfarmerId = (String)session.getAttribute("S_id");
		String farmerFarmingPlanCode = farmingPlanMapper.autoIncreaseCode("farmer_farming_plan");
		
		Map<String, Object> paramMap = farmingPlanMapper.getMinManagementUser();
		String hubCrewId = (String)paramMap.get("min_crew_id");
		
		Map<String, Object> farmingPlanMap = new HashMap();
		farmingPlanMap.put("farmerFarmingPlanCode", farmerFarmingPlanCode);
		farmingPlanMap.put("urbanfarmerId", urbanfarmerId);
		farmingPlanMap.put("farmerFarmingPlanNickname", farmerFarmingPlanNickname);
		farmingPlanMap.put("urbanKitCode", urbanKitCode);
		farmingPlanMap.put("urbanfarmHubCrewId", hubCrewId);
		farmingPlanMap.put("cropsNameCode", cropsNameCode);
		farmingPlanMapper.addCrops(farmingPlanMap);
		
		paramMap.clear();
		
		//등록 버튼을 누르면 계획 복사해 사용자에게 등록
		paramMap.put("urbanfarmerId", urbanfarmerId);
		paramMap.put("farmerFarmingPlanCode", farmerFarmingPlanCode);
		paramMap.put("cropsNameCode", cropsNameCode);
		paramMap.put("urbanKitCode", urbanKitCode);
		
		farmingPlanMapper.addPlan(paramMap);
		
	}
	
	/**
	 *  농사 시작
	 * @param farmerFarmingPlanCode
	 */
	public void startPlan(Map<String, Object> farmerFarmingPlanCode) {
		farmingPlanMapper.startPlan(farmerFarmingPlanCode);
	}
	
	/**
	 * 사용자별 작물 리스트
	 * @param userId
	 * @return farmerFarmingPlanCode, cropsName, farmerFarmingPlanStatus
	 */
	public List<FarmingPlan> getFarmingPlanListById(String userId){
		List<FarmingPlan> farmingPlanList = farmingPlanMapper.getFarmingPlanListById(userId);

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
