package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserInfoController {
	/** 회원 정보 수정과 회원 탈퇴를 고르는 화면(폼)								
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/userInfoMain")
	public String userInfoPage(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "user_info/user_info_main";
		
	}
	/** 회원 탈퇴를 위한 패스워드 입력화면								
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/removeUserPwCheck")
	public String removeUserPwCheck(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "user_info/remove_user_pw_check";
		
	}
	/** 회원 정보수정을 위한 패스워드 입력화면																
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/updateUserInfoPwCheck")
	public String updateUserInfoPw(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "user_info/update_user_info_pw_check";
		
	}
	/** 회원 탈퇴를 위한 패스워드 입력화면								
	 * 
	 * @return 회원정보 수정화면으로 리다이렉트
	 */
	@PostMapping("/userInfo/updateUserInfoPwCheck")
	public String postUpdateUserInfoPw(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return"redirect:/userInfo/updateUserInfo";
		
	}
	/** 회원 탈퇴 비밀번호를 확인하는 화면
	 * 
	 * @return 메인화면으로 리다이렉트
	 */
	@PostMapping("/userInfo/removeUserPwCheck")
	public String postRemoveUser(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "redirect:/index";
		
	}
	/** 회원 정보 수정하는 화면																
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/updateUserInfo")
	public String updateUserInfo(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "user_info/update_user_info";
		
	}
	/** 유저정보 유저쿠폰 배송지관리를 고르는 화면
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/userInfo/userInfoPage")
	public String userInfoMain(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "user_info/user_info_page";
	} 
	
}
