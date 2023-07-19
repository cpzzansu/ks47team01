package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks47team01.common.dto.AddressDeliveryRequest;
import ks47team01.common.dto.UrbanfarmerAddress;
import ks47team01.user.mapper.UrbanfarmerAddressMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UrbanfarmerAddressService {
	
	private final UrbanfarmerAddressMapper urbanfarmerAddressMapper;
	
	public void addUrbanfarmerAddress(UrbanfarmerAddress urbanfarmerAddress) {
		
		urbanfarmerAddressMapper.addUrbanfarmerAddress(urbanfarmerAddress);
		
		
		
	}
	
	public List<AddressDeliveryRequest> getAddressDeliveryRequestList() {
		
		List<AddressDeliveryRequest> addressDeliveryRequestList = urbanfarmerAddressMapper.getAddressDeliveryRequestList();
		
		return addressDeliveryRequestList;
	}
	
	public List<UrbanfarmerAddress> getUrbanfarmerAddressListById(String urbanfarmerId) {
		
		List<UrbanfarmerAddress> addressList = urbanfarmerAddressMapper.getUrbanfarmerAddressListById(urbanfarmerId);
		
		return addressList;
		
	}
	
	public UrbanfarmerAddress getUrbanfarmerAddressByCode(String urbanfarmerAddressCode) {
		
		UrbanfarmerAddress urbanfarmerAddress = urbanfarmerAddressMapper.getUrbanfarmerAddressByCode(urbanfarmerAddressCode);
		
		return urbanfarmerAddress;
		
	}
	
	public int updateUrbanfarmerAddress(UrbanfarmerAddress urbanfarmerAddress) {
		
		int result = urbanfarmerAddressMapper.updateUrbanfarmerAddressInfo(urbanfarmerAddress);
		
		return result;
		
	}

	public int deleteUrbanfarmerAddress(String urbanfarmerAddressCode) {
		
		int result = urbanfarmerAddressMapper.deleteUrbanfarmerAddress(urbanfarmerAddressCode);
		
		return result;
		
	}
	
	public int deleteForUrbanfarmerAddress(String urbanfarmerAddressCode) {
		
		int result = urbanfarmerAddressMapper.deleteForUrbanfarmerAddress(urbanfarmerAddressCode);
	
		return result;
	}

}

