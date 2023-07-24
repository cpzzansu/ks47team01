package ks47team01.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.PlantpickFollowers;
import ks47team01.user.service.PlantPickService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@AllArgsConstructor
public class PlantPickController {
	
	private final PlantPickService plantpickFollowersService;

	/**
	 * 메인화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/plantPickMain")
	public String userMainPlantPick(Model model) {
		model.addAttribute("title", "plantpick");
		return"user_plantpick/plantpick_main"; 
	}
	
	/**
	 * 내 게시물 화면								
	 * 
	 * @return
	 */
	@GetMapping("/userPlantPick/plantPickMyMain")
	public String userMyMainPlantPick(Model model) {
		model.addAttribute("title", "my posting");
		return "user_plantpick/plantpick_my_main";
	}
	
	/**
	 * 남 게시물 화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/plantPickYouMain")
	public String userYouMainPlantPick(Model model) {
		model.addAttribute("title","plantpick" );
		return "user_plantpick/plantpick_you_main";
	}
	
	/**
	 * 프로필 삭제화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/deletePlantPick")
	public String userDeletePlantPick(Model model) {
		model.addAttribute("title" , "delete profile");
		return "user_plantpick/delete_plantpick";
	}
	
	/**
	 * 프로필 수정화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/update")
	public String userUpdateProfile(Model model) {
		model.addAttribute("title", "profile 수정");
		return "user_plantpick/update_profile";
	}
	
	/**
	 * 프로필 메인화면								
	 * @return
	 */
	@GetMapping("/userPlantpick/profile")
	public String userProfile(Model model) {
		model.addAttribute("title" , "myprofile");
		
		return "user_plantpick/profile";
	}
	
	/**
	 * 팔로우 목록 화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/followList")
	public String userFollowList(Model model) {
		model.addAttribute("title" ,"follow list");
		return "user_plantpick/follow_list";
	}
	
	@PostMapping("/userPlantPick/followList")
	public String plantpickFollowListAction(@RequestParam MultipartFile[] uploadfile,
											@RequestParam String userId,
											@RequestParam String plantpickYn,
											HttpSession session,
											Model model) {
		String urbanfarmerId = (String) session.getAttribute("S_id");
		model.addAttribute("userId", userId);
		model.addAttribute("plantpickYn" , plantpickYn);
		
		plantpickFollowersService.getFollowersList(urbanfarmerId);
		
		return null;
		
	}
	
	/**
	 * 팔로우 차단 목록 화면								
	 * @return
	 */
	@GetMapping("/userPlantPick/followBanList")
	public String userFollowBanList(Model model) {
		model.addAttribute("title" , "ban list");
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
	public String userSearchPlantPick(Model model) {
		model.addAttribute("title", "seach");
		PlantpickFollowers plantpickFollowers;
		return "user_plantpick/search_plantpick";
	}
	
	/**
	 * 게시물 등록 화면
	 */
	@GetMapping("/userPlantPick/addPostPlantPick")
	public String userAddPostPlantPick(Model model) {
		model.addAttribute("title" , "게시물 등록");
		return "user_plantpick/plantpick_add_post";
	}
	
	
	
	
	
	
	
	
	
}
