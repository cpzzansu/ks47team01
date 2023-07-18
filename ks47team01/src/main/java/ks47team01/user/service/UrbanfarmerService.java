package ks47team01.user.service;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;
import ks47team01.common.dto.AddressDeliveryRequest;
import ks47team01.common.dto.IssuedCoupon;
import ks47team01.common.dto.Urbanfarmer;
import ks47team01.user.mapper.UrbanfarmerMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Transactional
public class UrbanfarmerService {
	
	private final UrbanfarmerMapper urbanfarmerMapper;
	
	@PostConstruct
	public void UserServiceInit() {
		System.out.println("userService 객체 생성");
	}
	
	
	public Urbanfarmer getUserInfoById(String urbanfarmerId) {
		
		Urbanfarmer urbanfarmerInfo = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		
			
			return urbanfarmerInfo;
		
		
		
		
	}
	
	public Map<String, Object> isValidUser(String urbanfarmerId, String urbanfarmerPw) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();

		boolean isValid = false;
		
		Urbanfarmer urbanfarmer = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		String isTrue = urbanfarmer.getUrbanfarmerDropClassification();
		
		if(urbanfarmer != null) {
			
			String pwCheck = urbanfarmer.getUrbanfarmerPw();
			
			if(urbanfarmer.getUrbanfarmerPw().equals(urbanfarmerPw) && isTrue.equals("정상")) {
				
				isValid = true;
				resultMap.put("urbanfarmerInfo", urbanfarmer);
				
			}
			
		}
		
		resultMap.put("isValid", isValid);
		
		return resultMap;
		
	}
	
	public void addUrbanfarmer(Urbanfarmer urbanfarmer) {
		
		urbanfarmerMapper.addUrbanfarmer(urbanfarmer);
		
	}
	
	public List<Urbanfarmer> getUserInfoList() {
		
		Map<String, Object> paramMap = null;
		
		List<Urbanfarmer> urbanfarmerList = urbanfarmerMapper.getUserInfoList(paramMap);
		
		return urbanfarmerList;
		
		
	}
	
	public boolean idCheck(String urbanfarmerId) {
		
		Urbanfarmer urbanfarmer = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		if(urbanfarmer != null) {
			return true;
		}
		return false;
	}
	
	public int updateUserInfo(Urbanfarmer urbanfarmer) {
		
		int result = urbanfarmerMapper.updateUserInfo(urbanfarmer);
		
		return result;
	}
	
	public void removeUserInfo(String urbanfarmerId) {
		
		urbanfarmerMapper.removeUserInfo(urbanfarmerId);
		
	}
	
	public IssuedCoupon addUrbanfarmerCoupon(String issuedCouponId) {
		
		IssuedCoupon issuedCoupon = urbanfarmerMapper.addUrbanfarmerCoupon(issuedCouponId);
		
		return issuedCoupon;
		
	}
	
	public IssuedCoupon getCouponInfo(String IssuedCouponId) {
		
		IssuedCoupon issuedCoupon = urbanfarmerMapper.getIssuedCouponInfoById(IssuedCouponId);
		
		return issuedCoupon;
		
	}
	
	public int getCouponInfoValidDays(String couponInformationCode) {
		
		int result = urbanfarmerMapper.getCouponInfoValidDays(couponInformationCode);
		
		return result;
		
	}
	
	
	

}
