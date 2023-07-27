package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.common.dto.HubLargeCate;
import ks47team01.common.dto.HubMidCateFinal;
import ks47team01.common.dto.VendingMachine;
import ks47team01.common.dto.VendingMachineSpace;
import ks47team01.user.mapper.UserVmMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class UserVmService {
		// TODO Auto-generated method stub
	private final UserVmMapper userVmMapper;
	
	public List<HubLargeCate> getHubList(){
		List<HubLargeCate> getHubList = userVmMapper.getHubList();
		
		return getHubList;
	}
	
	public List<HubMidCateFinal> getAreaList(String hubMidCateFinal){
		
		List<HubMidCateFinal> getAreaList = userVmMapper.getAreaList(hubMidCateFinal);
		
		return getAreaList;
	}
	
	public List<VendingMachine> getVmList(String hubMidCateFinalCode){
		
		List<VendingMachine> getVmList = userVmMapper.getVmList(hubMidCateFinalCode);
		
		return getVmList;
	}

	public List<VendingMachineSpace> getSpaceSelect(String vendingMachineCode) {
		
		List<VendingMachineSpace> getSpaceSelect = userVmMapper.getSpaceSelect(vendingMachineCode);
		
		return getSpaceSelect;
	}
	
	
}
