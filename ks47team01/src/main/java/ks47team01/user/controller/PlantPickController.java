package ks47team01.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class PlantPickController {

	/**
	 * 메인화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/plantPickMain")
	public String userMainPlantPick() {
		return"user_plantpick/plantpick_main"; 
	}
	
	/**
	 * 내 게시물 화면								
	 * 
	 * @return
	 */
	@GetMapping("/userPlantPick/plantPickMyMain")
	public String userMyMainPlantPick() {
		return "user_plantpick/plantpick_my_main";
	}
	
	/**
	 * 남 게시물 화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/plantPickYouMain")
	public String userYouMainPlantPick() {
		return "user_plantpick/plantpick_you_main";
	}
	
	/**
	 * 프로필 삭제화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/deletePlantPick")
	public String userDeletePlantPick() {
		return "user_plantpick/delete_plantpick";
	}
	
	/**
	 * 프로필 수정화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/update")
	public String userUpdateProfile() {
		return "user_plantpick/update_profile";
	}
	
	/**
	 * 프로필 메인화면								
	 * @return
	 */
	@GetMapping("/userPlantpick/profile")
	public String userProfile() {
		return "user_plantpick/profile";
	}
	
	/**
	 * 팔로우 목록 화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/followList")
	public String userFollowList() {
		return "user_plantpick/follow_list";
	}
	
	/**
	 * 팔로우 차단 목록 화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/followBanList")
	public String userFollowBanList() {
		return "user_plantpick/follow_ban_list";
	}
	
	/**
	 * 이미지 상세조회								
	 * @return
	 */
	@GetMapping("/userPlatPick/plantpickDetailImage")
	public String userPlantPickDetailImage() {
		return "user_plantpick/plantpick_detail_image";
	}
	
	/**
	 * 검색화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/searchPlantPick")
	public String userSearchPlantPick() {
		return "user_plantpick/search_plantpick";
	}
	//
	
	
	
	
	
	
	
	
	
	
}
