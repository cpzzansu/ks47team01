package ks47team01.admin.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks47team01.admin.mapper.UrbanfarmAdminMapper;
import ks47team01.common.dto.UrbanfarmAdmin;
import ks47team01.common.dto.Urbanfarmer;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UrbanfarmAdminService {
	
	private final UrbanfarmAdminMapper urbanfarmAdminMapper;
	
	public Map<String, Object> isValidUser(String urbanfarmerId, String urbanfarmerPw) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();

		boolean isValid = false;
		
		UrbanfarmAdmin urbanfarmAdmin = urbanfarmAdminMapper.getUrbanfarmAdminInfoById(urbanfarmerPw);
		
		if(urbanfarmAdmin != null) {
			
			String pwCheck = urbanfarmAdmin.getUrbanfarmAdminPw();
			
			if(pwCheck.equals(urbanfarmerPw)) {
				
				isValid = true;
				resultMap.put("urbanfarmAdminInfo", urbanfarmAdmin);
				
			}
			
		}
		
		resultMap.put("isValid", isValid);
		
		return resultMap;
		
	}
	
}
