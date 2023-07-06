package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserInfoController {

	@GetMapping("/userInfo/userInfoPage")
	public String userInfoPage() {
		
		return "user_info/user_info_page";
		
	}
	@GetMapping("/userInfo/removeUserPw")
	public String removeUserPw() {
		
		return "user_info/remove_user_pw";
		
	}
	
	@GetMapping("/userInfo/updateUserInfoPw")
	public String updateUserInfoPw() {
		
		return "user_info/update_user_info_pw";
		
	}
	@PostMapping("/userInfo/removeUserPw")
	public String postRemoveUserPw() {
		
		return"redirect:/userInfo/removeUser";
		
	}
	
	@PostMapping("/userInfo/updateUserInfoPw")
	public String postUpdateUserInfoPw() {
		
		return"redirect:/userInfo/updateUserInfo";
		
	}
	@GetMapping("/userInfo/removeUser")
	public String removeUser() {
		
		return "user_info/remove_user";
		
	}
	
	@GetMapping("/userInfo/updateUserInfo")
	public String updateUserInfo() {
		
		return "user_info/update_user_info";
		
	}
	
	
				
}