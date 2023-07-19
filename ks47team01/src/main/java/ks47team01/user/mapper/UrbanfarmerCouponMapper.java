package ks47team01.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.CouponInformation;
import ks47team01.common.dto.IssuedCoupon;

@Mapper
public interface UrbanfarmerCouponMapper {
	
	public List<Map<String, Object>> getIssuedCouponInfoById(String urbanfarmerId);
	
	public IssuedCoupon getIssuedCouponInfoByCoupon(String issuedCouponId);
	
	public int regiCoupon(String urbanfarmerId, String couponDelDate);
	
	
	
}
