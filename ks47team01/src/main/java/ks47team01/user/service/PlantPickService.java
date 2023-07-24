package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks47team01.common.dto.PlantpickFollowers;
import ks47team01.common.dto.PlantpickProfile;
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
	
	
	//어반팜 아이디 가져오기
	public Urbanfarmer plantPickUserInfoById(String urbanfarmerId) {
		
		Urbanfarmer urbanfarmerInfo = plnatpickmMapper.plantPickUserInfoById(urbanfarmerId);
		
			
			return urbanfarmerInfo;
		
	}
	
	//프로필 이미지 가져오기
	public PlantpickProfile plantPickprofileImage(String plantpicProfileImageUrl) {
		
		PlantpickProfile plantpickImage = plnatpickmMapper.plantPickprofileImage(null);
		
		return plantpickImage;
		
	}
}
