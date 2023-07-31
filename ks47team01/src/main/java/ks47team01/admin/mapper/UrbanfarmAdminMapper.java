package ks47team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks47team01.common.dto.UrbanfarmAdmin;

@Mapper
public interface UrbanfarmAdminMapper {
	
	public UrbanfarmAdmin getUrbanfarmAdminInfoById(String urbanfarmAdminId);
	
	public int addUrbanfarmAdmin(UrbanfarmAdmin urbanfarmAdmin); 
	
	public List<UrbanfarmAdmin> getUrbanfarmAdminEmail(String urbanfarmAdminEmail);

}
