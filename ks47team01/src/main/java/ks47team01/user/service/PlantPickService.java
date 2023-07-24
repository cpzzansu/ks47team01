package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks47team01.common.dto.PlantpickFollowers;
import ks47team01.common.dto.Urbanfarmer;
import ks47team01.user.mapper.PlantpickFollowersMapper;
import ks47team01.user.mapper.PlantpickMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlantPickService {
	
	private final PlantpickFollowersMapper plantpickFollowersMapper;
	private final PlantpickMapper plnatpickmMapper;
	
	public List<PlantpickFollowers> getFollowersList(String urbanfarmerId) {
		
		List<PlantpickFollowers> followersList = plantpickFollowersMapper.getFollowersId(urbanfarmerId);
		
		return followersList;
	}
	
	public Urbanfarmer plantPickUserInfoById(String urbanfarmerId) {
		
		Urbanfarmer urbanfarmerInfo = plnatpickmMapper.plantPickUserInfoById(urbanfarmerId);
		
			
			return urbanfarmerInfo;
		
		
		
		
	}
	
}
