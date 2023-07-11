package ks47team01.admin.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ks47team01.user.dto.FarmingPlan;
import ks47team01.user.mapper.FarmingPlanMapper;
import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
public class FarmingPlanService {
	
	private final FarmingPlanMapper farmingPlanMapper;
	
	public List<FarmingPlan> getFarmingPlanListById(String userId){
		List<FarmingPlan> farmingPlanList = farmingPlanMapper.getFarmingPlanListById(userId);
		return farmingPlanList;
	}
}
