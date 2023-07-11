package ks47team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.user.dto.FarmingPlan;

@Mapper
public interface FarmingPlanMapper {
	/**
	 * 사용자별 작물 리스트
	 * @param userId
	 * @return farmerFarmingPlanCode, cropsName, farmerFarmingPlanStatus
	 */
	public List<FarmingPlan> getFarmingPlanListById(String userId);
}
