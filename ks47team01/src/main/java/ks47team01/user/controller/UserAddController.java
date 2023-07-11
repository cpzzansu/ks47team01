package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAddController {
	/** 일반회원 회원가입 화면(폼)								
	 *  
	 * @param model
	 * @return 
	 */
    @GetMapping("/userAdd/userAddForm")
    public String userAddForm(Model model) {
        model.addAttribute("title", "urbanfarm_회원가입");
        model.addAttribute("urbanfarmer", "1");
        return "user_add/user_add_form";
    }

}
