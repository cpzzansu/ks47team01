package ks47team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.admin.mapper.AdminVmMapper;
import ks47team01.common.dto.HubLargeCate;
import ks47team01.common.dto.HubMidCateFinal;
import ks47team01.common.dto.VendingMachine;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
public class AdminVmService {

	private final AdminVmMapper adminVmMapper;
	
	public List<HubLargeCate> getHubList(){
		List<HubLargeCate> getHubList = adminVmMapper.getHubList();
		
		return getHubList;
	}
	
	public List<HubMidCateFinal> getAreaList(String hubMidCateFinal){
		
		List<HubMidCateFinal> getAreaList = adminVmMapper.getAreaList(hubMidCateFinal);
		
		return getAreaList;
	}
	
	public List<VendingMachine> getVmList(String hubMidCateFinalCode){
		
		List<VendingMachine> getVmList = adminVmMapper.getVmList(hubMidCateFinalCode);
		
		return getVmList;
	}
	
}
