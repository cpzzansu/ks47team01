package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("adminOrderController")
public class AdminOrderController {

    @GetMapping("adminOrder/adminOrderManage")
    public String admin_order_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin/order/order_main";
    }

}
