package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("adminShopController")
public class AdminShopController {

    @GetMapping("adminShop/adminShopManage")
    public String admin_shop_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin/shop/shop_main";
    }
}
