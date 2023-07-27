package ks47team01.common.dto;

import java.util.List;

import lombok.Data;

@Data
public class UrbanKit {
	
	private String urbanKitCode;
	private String urbanKitName;
	private String cropsGrowingInfoCode;
	private String cropsNameCode;
	private String writerId;
	private String staffTableType;
	private String urbanfarmHubId;
	private int urbanKitCost;
	private int urbanKitPrice;
	private int urbanKitPropit;
	private String urbanKitContent;
	private String urbanKitPic;
	private String urbanKitRegDate;
	
	private List<FarmingPlan> farmingPlanList;
	private String cropsName;

}
