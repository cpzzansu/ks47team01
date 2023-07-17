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
	
	public UrbanfarmerAddress addUrbanfarmerAddress(UrbanfarmerAddress urbanfarmerAddress) {
		
		UrbanfarmerAddress urbanfarmerAddressInfo = urbanfarmerAddressMapper.addUrbanfarmerAddress(urbanfarmerAddress);
		
		return urbanfarmerAddressInfo;
		
	}
	
	public List<AddressDeliveryRequest> getAddressDeliveryRequestList() {
		
		List<AddressDeliveryRequest> addressDeliveryRequestList = urbanfarmerAddressMapper.getAddressDeliveryRequestList();
		
		return addressDeliveryRequestList;
	}

}
