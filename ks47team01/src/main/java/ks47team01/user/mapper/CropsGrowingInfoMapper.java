package ks47team01.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.CropsGrowingInfo;

@Mapper
public interface CropsGrowingInfoMapper {
	
	/**
	 * 작물명 코드별 작물재배정보
	 * @param CropsNameCode
	 * @return CropsGrowingInfo
	 */
	public CropsGrowingInfo getCropsGrowingInfoByCode(String CropsNameCode); 
}
