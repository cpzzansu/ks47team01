package ks47team01.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.PlantpickFollowers;
import ks47team01.common.dto.Urbanfarmer;
@Mapper
public interface PlantpickMapper {
	//로그인 이력 조회 
	public List<Map<String,Object>> getLoginHistoryList(Map<String,Object> paramMap);
	
	//로그인 이력 테이블의 전체 행의 갯수;
	public int getLoginCnt();
	
	public List<PlantpickFollowers> getMemberList(Map<String,Object>paramMap);
}
