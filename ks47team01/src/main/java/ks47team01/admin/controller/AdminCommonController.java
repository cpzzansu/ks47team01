package ks47team01.admin.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks47team01.admin.service.AdminCommonService;

@Controller("adminCommonController")
public class AdminCommonController {

    private final AdminCommonService adminCommonService;

    public AdminCommonController(@Qualifier("adminCommonService") AdminCommonService adminCommonService) {
        this.adminCommonService = adminCommonService;
    }

    @GetMapping("/admin")
    public String adminMain(Model model) {

        return "admin/main";
    }
}
