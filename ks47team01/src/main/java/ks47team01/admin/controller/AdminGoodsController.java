package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("adminGoodsController")
public class AdminGoodsController {

    @GetMapping("adminGoods/adminGoodsManage")
    public String admin_goods_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin/order/order_main";
    }
}
