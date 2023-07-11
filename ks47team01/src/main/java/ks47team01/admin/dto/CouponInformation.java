package ks47team01.admin.dto;

import lombok.Data;

@Data
public class CouponInformation {
	
	private String couponInformationId;
	private String writerId;
	private String staffTableType;
	private String couponInformationName;
	private int couponInformationDiscountRate;
	private String couponInformationValidStartDays;
	private String couponInformationValidEndDays;
	private String urbanfarmHubId;
	private String couponInformationExpireSort;
	private int couponInformationValidDays;
	private String couponInformationRegDate;

}
