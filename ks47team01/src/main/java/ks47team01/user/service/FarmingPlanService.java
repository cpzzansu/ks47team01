package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.common.dto.FarmingPlan;
import ks47team01.user.mapper.FarmingPlanMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Transactional
@AllArgsConstructor
@Service
@Log4j2
public class FarmingPlanService {
	
	private final FarmingPlanMapper farmingPlanMapper;
	
	/**
	 * 사용자별 작물 리스트
	 * @param userId
	 * @return farmerFarmingPlanCode, cropsName, farmerFarmingPlanStatus
	 */
	public List<FarmingPlan> getFarmingPlanListById(String userId){
		List<FarmingPlan> farmingPlanList = farmingPlanMapper.getFarmingPlanListById(userId);
		log.info(farmingPlanList);
		return farmingPlanList;
	}
}
