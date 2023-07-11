package ks47team01.user.dto;

import lombok.Data;

@Data
public class IssuedCoupon {
	
	private String issuedCouponId;
	private String urbanfarmerId;
	private String couponInformationId;
	private String writerId;
	private String urbanfarmHubId;
	private String couponHistoryDate;
	private String couponHistoryDelDate;
	private String couponHistoryUseCheck;

}
