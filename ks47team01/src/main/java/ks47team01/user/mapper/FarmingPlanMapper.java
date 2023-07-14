package ks47team01.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.FarmingPlan;

@Mapper
public interface FarmingPlanMapper {
	
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
}
