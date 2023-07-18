package ks47team01.user.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.PlantpickFollowers;

@Mapper
public interface PlantpickFollowersMapper {

	/**
	 * 회원 목록 조회 
	 * @return List<CropsName>
	 */
	public List<PlantpickFollowers> getPlantpickFollowersList(Map<String,Object>paramMap);
}
