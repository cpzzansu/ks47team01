package ks47team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.UrbanfarmHub;
import ks47team01.common.dto.UrbanfarmHubCrew;

@Mapper
public interface UrbanfarmHubCrewMapper {
	
	public UrbanfarmHubCrew getHubCrewInfoById(String urbanfarmHubCrewId); 
	
	public List<String> getUrbanfarmHubCrewEmailList(String urbanfarmHubCrewEmail);
	
	public int addUrbanfarmHubCrew(UrbanfarmHubCrew urbanfarmHubCrew);
	
	public List<UrbanfarmHub> getUrbanfarmHubList();
	
}
