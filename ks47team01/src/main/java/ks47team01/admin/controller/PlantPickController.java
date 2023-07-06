package ks47team01.admin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class PlantPickController {
	
	//메인화면 
	@GetMapping("/userPantPick/plantPickMain")
	public String userMainPlantPick() {
		return"user_plantpick/plantpick_main"; 
	}
	
	//유저 내 게시물 화면
	@GetMapping("/userPlantPick/plantPickMyMain")
	public String userMyMainPlantPick() {
		return "user_plantpick/plantpick_my_main";
	}
	
	//유저 남 게시물 화면
	@GetMapping("/userPlantPick/plantPickYouMain")
	public String userYouMainPlantPick() {
		return "user_plantpick/plantpick_you_main";
	}
	
	// 유저 프로필 삭제 화면
	@GetMapping("/userPlantPick/deletePlantPick")
	public String userDeletePlantPick() {
		return "user_plantpick/delete_plantpick";
	}
	
	// 유저 프로필 업데이트 화면
	@GetMapping("/userPlantPick/update")
	public String userUpdateProfile() {
		return "user_plantpick/update_profile";
	}
	
	// 유저 프로필 화면
	@GetMapping("/userPlantpick/profile")
	public String userProfile() {
		return "user_plantpick/profile";
	}
	
	//팔로우 리스트 화면
	@GetMapping("/userPlantPick/followList")
	public String userFollowList() {
		return "user_plantpick/follow_list";
	}
	
	//차단 팔로우 리스트 화면
	@GetMapping("/userPlantPick/followBanList")
	public String userFollowBanList() {
		return "user_plantpick/follow_ban_list";
	}
	
	//이미지 상세조회 (게시물 )
	@GetMapping("/userPlatPick/plantpickDetailImage")
	public String userPlantPickDetailImage() {
		return "user_plantpick/plantpick_detail_image";
	}
	
	//검색 화면
	@GetMapping("/userPlantPick/searchPlantPick")
	public String userSearchPlantPICK() {
		return "user_plantpick/search_plantpick";
	}
	//
	
	
	
	
	
	
	
	
	
	
}
