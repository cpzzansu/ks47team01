package ks47team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.CropsName;

@Mapper
public interface PlantpickFollowersMapper {

	/**
	 * 작물의 이름 리스트
	 * @return List<CropsName>
	 */
	public List<CropsName> getCropsNameList();
}
