package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks47team01.common.dto.PlantpickFollowers;
import ks47team01.user.mapper.PlantpickFollowersMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlantPickFollowersService {
	
	private final PlantpickFollowersMapper plantpickFollowersMapper;
	
	public List<PlantpickFollowers> getFollowersList(String urbanfarmerId) {
		
		List<PlantpickFollowers> followersList = plantpickFollowersMapper.getFollowersId(urbanfarmerId);
		
		return followersList;
	}
	
	
}
