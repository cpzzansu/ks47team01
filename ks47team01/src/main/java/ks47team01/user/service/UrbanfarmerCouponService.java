package ks47team01.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks47team01.common.dto.CouponInformation;
import ks47team01.common.dto.IssuedCoupon;
import ks47team01.user.mapper.UrbanfarmerCouponMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UrbanfarmerCouponService {
	
	private final UrbanfarmerCouponMapper urbanfarmerCouponMapper;
	
	public List<Map<String, Object>> getUrbanfarmerCouponInfoById(String urbanfarmerId) {
		
		List<Map<String, Object>> CouponList = urbanfarmerCouponMapper.getIssuedCouponInfoById(urbanfarmerId);
		
		return CouponList;
	}
	
	public IssuedCoupon getIssuedCouponInfoByCoupon(String issuedCouponId) {
		
		IssuedCoupon issuedCoupon = urbanfarmerCouponMapper.getIssuedCouponInfoByCoupon(issuedCouponId);
		
		return issuedCoupon;
		
	}
	
	public int regiCoupon(String urbanfarmerId, String couponDelDate) {
		
		int result = urbanfarmerCouponMapper.regiCoupon(urbanfarmerId, couponDelDate);
		
		return result;
		
	}

}
