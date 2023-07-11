package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindController {

    // 비밀번호 찾기 폼 이동
	/** 일반회원 비밀번호 찾기 정보입력 폼								
	 * 
	 * @param model
	 * @return user_find/usert_find_pw_form.html
	 */
    @GetMapping("/userFind/userFindPwForm")
    public String userPwFind(Model model) {
        model.addAttribute("title", "비밀번호 찾기");
        return "user_find/usert_find_pw_form";
    }

    // 아이디 찾기 폼 이동
    /** 일반회원 아이디 찾기 정보입력 폼								
     * 
     * @param model
     * @return user_find/user_find_id_form.html
     */
    @GetMapping("/userFind/userFindIdForm")
    public String userIdFind(Model model) {
        model.addAttribute("title", "아이디 찾기");
        return "user_find/user_find_id_form";
    }
    /** 일반회원 아이디 찾기 아이디 찾기 실패 화면								
     * 
     * @param model
     * @return user_find/user_find_id_fail.html
     */
    @GetMapping("/userFind/userFindIdFail")
    public String userIdFindFail(Model model) {
        model.addAttribute("title", "아이디 찾기 실패");
        return "user_find/user_find_id_fail";
    }
    /** 일반회원 아이디 찾기 아이디 찾기 성공 화면								
     * 
     * @param model
     * @return
     */
    @GetMapping("/userFind/userFindIdSuccess")
    public String userIdFindSuccess(Model model) {
        model.addAttribute("title", "아이디 찾기 성공");
        return "user_find/user_find_id_success";
    }
    /** 일반회원 비밀번호 찾기 비밀번호 찾기 실패 화면								
     * 
     * @param model
     * @return 
     */
    @GetMapping("/userFind/userFindPwFail")
    public String userPwFindFail(Model model) {
        model.addAttribute("title", "아이디 찾기 실패");
        return "user_find/user_find_pw_fail";
    }
    /** 일반회원 비밀번호 찾기 비밀번호 찾기 성공 화면								
     * 
     * @param model
     * @return 
     */
    @GetMapping("/userFind/userFindPwSuccess")
    public String userPwFindSuccess(Model model) {
        model.addAttribute("title", "아이디 찾기 성공");
        return "user_find/user_find_pw_success";
    }
}
