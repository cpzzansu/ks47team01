package ks47team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.UrbanKit;

@Mapper
public interface UrbanKitMapper {
	
	/**
	 * 키트 리스트
	 * @return List<UrbanKit>
	 */
	public List<UrbanKit> getUrbanKitList();
	
	/**
	 * 작물 코드별 키트리스트
	 * @param cropsNameCode
	 * @return
	 */
	public List<UrbanKit> getUrbanKitListByCode(String cropsNameCode);
}
