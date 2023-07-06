package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping("/userLogin/userLogin")
    public String userLoginAction(Model model) {
        model.addAttribute("title", "urbanfarm");
        return "user_login/main_login";
    }

    // 로그인화면
    @GetMapping("/userLogin/userLogin")
    public String loginForm(Model model) {
        model.addAttribute("title", "urbanfarm");
        return "user_login/user_login";
    }
    
    @GetMapping("/userLogin/add_user")
    public String addForm(Model model) {
    	
    	
    	return "user_add/user_add_form";
    }

}
