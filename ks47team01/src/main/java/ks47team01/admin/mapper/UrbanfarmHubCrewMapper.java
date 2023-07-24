package ks47team01.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.UrbanfarmHubCrew;

@Mapper
public interface UrbanfarmHubCrewMapper {
	
	public UrbanfarmHubCrew getHubCrewInfoById(String urbanfarmHubCrewId); 
	
}
