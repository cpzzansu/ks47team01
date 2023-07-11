package ks47team01.user.dto;

import lombok.Data;

@Data
public class FarmingPlan {
	private String farmerFarmingPlanCode;
	private String urbanfarmerId;
	private String urbanfarmHubCrewId;
	private String cropsNameCode;
	private String cropsName;
	private String cropsGrowingInfoCode;
	private String urbanKitCode;
	private String farmerFarmingPlanRegDate;
	private String farmerFarmingPlanStartDate;
	private String farmerFarmingPlanEndDate;
	private String farmerFarmingPlanStatus;
}
