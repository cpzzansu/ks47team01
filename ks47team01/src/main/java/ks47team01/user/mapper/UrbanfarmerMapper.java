package ks47team01.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.Urbanfarmer;
@Mapper
public interface UrbanfarmerMapper {
	
	public Urbanfarmer getUserInfoById(String urbanfarmerId);
	
	public int addUrbanfarmer(Urbanfarmer urbanfarmer);
	
	public List<Urbanfarmer> getUserInfoList(Map<String , Object> paramMap);

}
