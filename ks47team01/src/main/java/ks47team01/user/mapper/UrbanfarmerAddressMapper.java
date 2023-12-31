package ks47team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.AddressDeliveryRequest;
import ks47team01.common.dto.UrbanfarmerAddress;

@Mapper
public interface UrbanfarmerAddressMapper {
	
	public int addUrbanfarmerAddress(UrbanfarmerAddress urbanfarmerAddress);
	
	public List<AddressDeliveryRequest> getAddressDeliveryRequestList();
	
	public List<UrbanfarmerAddress> getUrbanfarmerAddressListById(String urbanfarmerId);
	
	public UrbanfarmerAddress getUrbanfarmerAddressByCode(String urbanfarmerAddressCode);
	
	public int updateUrbanfarmerAddressInfo(UrbanfarmerAddress urbanfarmerAddress);
	
	public int deleteUrbanfarmerAddress(String urbanfarmerAddressCode);
	
	public int deleteForUrbanfarmerAddress(String urbanfarmerAddressCode);

}
