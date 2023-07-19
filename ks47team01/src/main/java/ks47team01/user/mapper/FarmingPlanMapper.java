package ks47team01.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.FarmingDetailPlan;
import ks47team01.common.dto.FarmingPlan;
import ks47team01.common.dto.FarmingPlanLargeCate;

@Mapper
public interface FarmingPlanMapper {
	
	/**
	 * 사용자별 작물별 계획등록
	 * @param Map<String, Object> paramMap
	 * urbanfarmerId, farmerFarmingPlanCode, cropsNameCode, urbanKitCode
	 */
	public void addPlan(Map<String, Object> paramMap);
	

	
	/**
	 * 담당하는 계획이 가장 적은 crew한명
	 * @return Map<String,Object> : min_crew_id, user_count
	 */
	public Map<String, Object> getMinManagementUser();
	
	/**
	 * 사용자별 작물 리스트
	 * @param userId
	 * @return List<FarmingPlan>: farmerFarmingPlanCode, cropsName, farmerFarmingPlanStatus
	 */
	public List<FarmingPlan> getFarmingPlanListById(String userId);
	
	/**
	 * 작물 추가
	 * @param cropsNameCode
	 * @param urbanKitCode
	 */
	public void addCrops(Map<String, Object> farmingPlan);
	
	
	/**
	 * 테이블명을 입력받으면 자동증가된 코드를 반환
	 * @param tableName
	 * @return 증가된 코드
	 */
	public String autoIncreaseCode(String tableName);
	
	/**
	 * 코드별 계획
	 * @param farmerFarmingPlanCode
	 * @return
	 */
	public FarmingPlan getFarmingPlanByCode(String farmerFarmingPlanCode);
	
	/**
	 * 코드별 대분류 조회
	 * @param farmerFarmingPlanCode
	 * @return FarmingPlanLargeCate
	 */
	public List<FarmingPlanLargeCate> getFarmingLargeCateByCode(String farmerFarmingPlanCode);
}
