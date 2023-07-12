package ks47team01.common.dto;

import lombok.Data;

@Data
public class FarmingDetailPlan {
	private String farmerFarmingDetailPlanCode;
	private String urbanfamerId;
	private String farmerFarmingPlanCode;
	private String cropsNameCode;
	private String cropsName;
	private String urbanKitCode;
	private String cropsGrowingInfoCode;
	private String farmingPlanLargeCateCode;
	private String farmingPlanSmallCateCode;
	private String farmerFarmingDetailPlanTitle;
	private String farmerFarmingDetailPlanContent;
	private int farmerFarmingDetailPlanSortation;
	private String farmerFarmingDetailPlanRegDate;
	private String farmerFarmingDetailPlanStatus;
}
