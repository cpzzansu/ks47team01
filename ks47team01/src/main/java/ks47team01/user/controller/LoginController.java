package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
	

	/** 일반회원 로그인 화면								
	 * 
	 * @param model
	 * @return 
	 */
    @GetMapping("/userLogin/userLogin")
    public String loginForm(Model model) {
        model.addAttribute("title", "로그인");
        
        return "user_login/user_login";
    }

}
