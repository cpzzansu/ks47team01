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

}
