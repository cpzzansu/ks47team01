package ks47team01.user.service;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;
import ks47team01.user.dto.Urbanfarmer;
import ks47team01.user.mapper.UrbanfarmerMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
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
		
		boolean isValid = false;
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		Urbanfarmer urbanfarmer = urbanfarmerMapper.getUserInfoById(urbanfarmerId);
		
		if(urbanfarmer != null) {
			
			String checkPw = urbanfarmer.getUrbanfarmerPw();
			if(checkPw == urbanfarmerPw) {
				
				isValid = true;
				resultMap.put("urbanfarmerInfo", urbanfarmer);
				
			}
			
		}
		
		resultMap.put("isValid", isValid);
		
		return resultMap;
		
	}
	

}
