package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/userLogin/userLoginAction")
    public String userLoginAction(Model model) {
        model.addAttribute("title", "urbanfarm");
        return "user_login/main_login";
    }

    // 로그인 폼 화면
    @GetMapping("/userLogin/userLogin")
    public String loginForm(Model model) {
        model.addAttribute("title", "urbanfarm");
        return "user_login/user_login";
    }

}
