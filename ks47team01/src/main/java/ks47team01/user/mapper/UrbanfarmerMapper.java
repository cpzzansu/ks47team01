package ks47team01.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.Urbanfarmer;
@Mapper
public interface UrbanfarmerMapper {
	
	public Urbanfarmer getUserInfoById(String urbanfarmerId);
	
	public void addUrbanfarmer();

}
