package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindController {

    // 비밀번호 찾기 폼 이동
    @GetMapping("/userFind/userFindPwForm")
    public String userPwFind(Model model) {
        model.addAttribute("title", "urbanfarm_아이디/비밀번호 찾기");
        return "user_find/find_user_pw_form";
    }

    // 아이디 찾기 폼 이동
    @GetMapping("/userFind/userFindIdForm")
    public String userIdFind(Model model) {
        model.addAttribute("title", "urbanfarm_아이디/비밀번호 찾기");
        return "user_find/find_user_id_form";
    }
}
