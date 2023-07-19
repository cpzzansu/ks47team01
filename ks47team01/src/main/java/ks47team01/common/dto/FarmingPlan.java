package ks47team01.common.dto;

import lombok.Data;

@Data
public class FarmingPlan {
	private String farmerFarmingPlanCode;
	private String urbanfarmerId;
	private String urbanfarmHubCrewId;
	private String cropsNameCode;
	private String cropsName;
	private String farmerFarmingPlanNickname;
	private String cropsGrowingInfoCode;
	private String urbanKitCode;
	private String farmerFarmingPlanRegDate;
	private String farmerFarmingPlanStartDate;
	private String farmerFarmingPlanEndDate;
	private String farmerFarmingPlanStatus;
	private String urbanKitName;
}
