package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMyPageController {

	@GetMapping("/user/userMyPage")
	public String myPage(Model model) {
		return "user_mypage/user_mypage";
	} 
	
}
