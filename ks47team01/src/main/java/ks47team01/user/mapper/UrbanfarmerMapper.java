package ks47team01.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.AddressDeliveryRequest;
import ks47team01.common.dto.IssuedCoupon;
import ks47team01.common.dto.Urbanfarmer;
@Mapper
public interface UrbanfarmerMapper {
	
	public Urbanfarmer getUserInfoById(String urbanfarmerId);
	
	public int addUrbanfarmer(Urbanfarmer urbanfarmer);
	
	public List<Urbanfarmer> getUserInfoList(Map<String , Object> paramMap);
	
	public int updateUserInfo(Urbanfarmer urbanfarmer);
	
	public int removeUserInfo(String urbanfarmerId);
	
	public IssuedCoupon addUrbanfarmerCoupon(String issuedCouponId);
	
	public IssuedCoupon getIssuedCouponInfoById(String issuedCouponId);
	
	public int getCouponInfoValidDays(String couponInformationCode);

}
