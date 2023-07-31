package ks47team01.admin.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.HubLargeCate;
import ks47team01.common.dto.HubMidCateFinal;
import ks47team01.common.dto.VendingMachine;


@Mapper
public interface AdminVmMapper {

	public List<HubLargeCate> getHubList();
	
	public List<HubMidCateFinal> getAreaList(String hubMidCateFinal);

	public List<VendingMachine> getVmList(String hubMidCateFinalCode);
	

}
