package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindController {

    // 비밀번호 찾기 폼 이동
    @GetMapping("/userFind/userFindPwForm")
    public String userPwFind(Model model) {
        model.addAttribute("title", "urbanfarm_비밀번호 찾기");
        return "user_find/usert_find_pw_form";
    }

    // 아이디 찾기 폼 이동
    @GetMapping("/userFind/userFindIdForm")
    public String userIdFind(Model model) {
        model.addAttribute("title", "urbanfarm_아이디 찾기");
        return "user_find/user_find_id_form";
    }
    
    @GetMapping("/userFind/userFindIdFail")
    public String userIdFindFail(Model model) {
        model.addAttribute("title", "urbanfarm_아이디 찾기 실패");
        return "user_find/user_find_id_fail";
    }
    
    @GetMapping("/userFind/userFindIdSuccess")
    public String userIdFindSuccess(Model model) {
        model.addAttribute("title", "urbanfarm_아이디 찾기 성공");
        return "user_find/user_find_id_success";
    }
    
    @GetMapping("/userFind/userFindPwFail")
    public String userPwFindFail(Model model) {
        model.addAttribute("title", "urbanfarm_아이디 찾기 실패");
        return "user_find/user_find_pw_fail";
    }
    
    @GetMapping("/userFind/userFindPwSuccess")
    public String userPwFindSuccess(Model model) {
        model.addAttribute("title", "urbanfarm_아이디 찾기 성공");
        return "user_find/user_find_pw_success";
    }
}
