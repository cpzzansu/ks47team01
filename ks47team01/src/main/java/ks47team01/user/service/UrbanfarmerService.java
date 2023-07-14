package ks47team01.user.service;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;
import ks47team01.common.dto.Urbanfarmer;
import ks47team01.user.mapper.UrbanfarmerMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Transactional
public class UrbanfarmerService {
	
	private final UrbanfarmerMapper urbanfarmerMapper;
	
	@PostConstruct
	public void UserServiceInit() {
		System.out.println("userService 객체 생성");
	}
	
	
	public Urbanfarmer getUserInfoById(String urbanfarmerId) {
		
		Urbanfarmer urbanfarmerInfo = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		
		return urbanfarmerInfo;
		
	}
	
	public Map<String, Object> isValidUser(String urbanfarmerId, String urbanfarmerPw) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();

		boolean isValid = false;
		
		Urbanfarmer urbanfarmer = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		
		if(urbanfarmer != null) {
			
			String pwCheck = urbanfarmer.getUrbanfarmerPw();
			
			if(urbanfarmer.getUrbanfarmerPw().equals(urbanfarmerPw)) {
				
				isValid = true;
				resultMap.put("urbanfarmerInfo", urbanfarmer);
				
			}
			
		}
		
		resultMap.put("isValid", isValid);
		
		return resultMap;
		
	}
	
	public void addUrbanfarmer(Urbanfarmer urbanfarmer) {
		
		urbanfarmerMapper.addUrbanfarmer(urbanfarmer);
		
	}
	
	public List<Urbanfarmer> getUserInfoList() {
		
		Map<String, Object> paramMap = null;
		
		List<Urbanfarmer> urbanfarmerList = urbanfarmerMapper.getUserInfoList(paramMap);
		
		return urbanfarmerList;
		
		
	}
	
	public boolean idCheck(String urbanfarmerId) {
		
		Urbanfarmer urbanfarmer = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		if(urbanfarmer != null) {
			return true;
		}
		return false;
	}
	
	public void updateUserInfo(String urbanfarmerId) {
		
		urbanfarmerMapper.updateUserInfo(urbanfarmerId);
		
	}
	

}
