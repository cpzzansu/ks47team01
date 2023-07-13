package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("adminShopController")
public class AdminShopController {

    @GetMapping("adminShop/adminShopManage")
    public String admin_shop_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_main";
    }

    @GetMapping("adminShop/adminShopAdd")
    public String admin_shop_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_add";
    }

    @GetMapping("adminShop/adminShopModify")
    public String admin_shop_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_modify";
    }

    @GetMapping("adminShop/adminShopRemove")
    public String admin_shop_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_remove";
    }

    @GetMapping("adminShop/adminShopLabelManage")
    public String admin_shop_label_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_main";
    }

    @GetMapping("adminShop/adminShopLabelAdd")
    public String admin_shop_label_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_add";
    }

    @GetMapping("adminShop/adminShopLabelModify")
    public String admin_shop_label_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_modify";
    }

    @GetMapping("adminShop/adminShopLabelRemove")
    public String admin_shop_label_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_remove";
    }

}
