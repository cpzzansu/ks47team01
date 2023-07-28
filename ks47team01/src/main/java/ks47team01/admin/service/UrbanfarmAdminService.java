package ks47team01.admin.service;

import java.util.HashMap;
import java.util.List;
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
	
	public Map<String, Object> isValidUser(String urbanfarmerAdminId, String urbanfarmAdminPw) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();

		boolean isValid = false;
		
		UrbanfarmAdmin urbanfarmAdmin = urbanfarmAdminMapper.getUrbanfarmAdminInfoById(urbanfarmerAdminId);
		
		if(urbanfarmAdmin != null) {
			
			String pwCheck = urbanfarmAdmin.getUrbanfarmAdminPw();
			
			if(pwCheck.equals(urbanfarmAdminPw)) {
				
				isValid = true;
				resultMap.put("urbanfarmAdminInfo", urbanfarmAdmin);
				
			}
			
		}
		
		resultMap.put("isValid", isValid);
		
		return resultMap;
		
	}
	
	public int addUrbanfarmAdmin(UrbanfarmAdmin urbanfarmAdmin) {
		
		int result = urbanfarmAdminMapper.addUrbanfarmAdmin(urbanfarmAdmin);
		
		return result;
	}
	
	public List<UrbanfarmAdmin> getUrbanfarmAdminEmailList(String urbanfarmAdminEmail) {
		
		List<UrbanfarmAdmin> EmailList = urbanfarmAdminMapper.getUrbanfarmAdminEmail(urbanfarmAdminEmail);
		
		return EmailList;
		
	}
	
	public boolean idCheck(String urbanfarmAdminId) {
		
		UrbanfarmAdmin urbanfarmInfo = urbanfarmAdminMapper.getUrbanfarmAdminInfoById(urbanfarmAdminId);
		boolean isValid = false;
		if(urbanfarmInfo != null) {
			isValid = true;
			return isValid;
		}
		return isValid;
		
	}

	
}
