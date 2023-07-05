package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAddController {

    @GetMapping("/userInsert/userInsertForm")
    public String userInsertForm(Model model) {
        model.addAttribute("title", "urbanfarm_회원가입");
        model.addAttribute("urbanfarmer", "1");
        return "user_insert/user_insert_form";
    }
}
