package ks47team01.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks47team01.admin.mapper.UrbanfarmHubCrewMapper;
import ks47team01.common.dto.UrbanfarmAdmin;
import ks47team01.common.dto.UrbanfarmHub;
import ks47team01.common.dto.UrbanfarmHubCrew;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UrbanfarmHubCrewService {
	
	private final UrbanfarmHubCrewMapper urbanfarmHubcrewMapper;
	
	
	public Map<String, Object> isValidUser(String urbanfarmHubCrewId, String urbanfarmHubCrewPw) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();

		boolean isValid = false;
		
		UrbanfarmHubCrew urbanfarmHubCrew = urbanfarmHubcrewMapper.getHubCrewInfoById(urbanfarmHubCrewId);
		
		if(urbanfarmHubCrew != null) {
			
			String pwCheck = urbanfarmHubCrew.getUrbanfarmHubCrewPw();
			
			if(pwCheck.equals(urbanfarmHubCrewPw)) {
				
				isValid = true;
				resultMap.put("hubCrewInfo", urbanfarmHubCrew);
				
			}
			
		}
		
		resultMap.put("isValid", isValid);
		
		return resultMap;
		
	} 
	
	public List<String> getEmailList(String urbanfarmHubEmail) {
		
		List<String> emailList = urbanfarmHubcrewMapper.getUrbanfarmHubCrewEmailList(urbanfarmHubEmail);
	
		return emailList;
		
	}
	
	public boolean urbanfarmHubCrewIdCheck(String urbanfarmHubCrewId) {
		
		UrbanfarmHubCrew urbanfarmHubCrewInfo = urbanfarmHubcrewMapper.getHubCrewInfoById(urbanfarmHubCrewId);
		boolean isVaild = false;
		
		if(urbanfarmHubCrewInfo != null) {
			isVaild = true;
			return isVaild;
		}
		
		return isVaild;
		
	}
	
	public int addUrbanfarmHubCrew(UrbanfarmHubCrew urbanfarmHubCrew) {
		
		int result = urbanfarmHubcrewMapper.addUrbanfarmHubCrew(urbanfarmHubCrew);
		
		return result;
		
	}
	
	public List<UrbanfarmHub> getUrbanfarmHubList() {
		
		List<UrbanfarmHub> hubList = urbanfarmHubcrewMapper.getUrbanfarmHubList();
		
		return hubList;
		
	}

}
