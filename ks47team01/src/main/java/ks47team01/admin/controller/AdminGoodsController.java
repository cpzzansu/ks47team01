package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("adminGoodsController")
public class AdminGoodsController {

    @GetMapping("adminGoods/adminGoodsManage")
    public String admin_goods_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_main";
    }

    @GetMapping("adminGoods/adminGoodsCheck")
    public String admin_goods_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_check";
    }

    @GetMapping("adminGoods/adminGoodsAdd")
    public String admin_goods_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_add";
    }

    @GetMapping("adminGoods/adminGoodsModify")
    public String admin_goods_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_modify";
    }

    @GetMapping("adminGoods/adminGoodsRemove")
    public String admin_goods_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_remove";
    }

    @GetMapping("adminGoods/adminGoodsFailureManage")
    public String admin_goods_failure_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_main";
    }

    @GetMapping("adminGoods/adminGoodsFailureCheck")
    public String admin_goods_failure_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_check";
    }

    @GetMapping("adminGoods/adminGoodsFailureAdd")
    public String admin_goods_failure_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_add";
    }

    @GetMapping("adminGoods/adminGoodsFailureModify")
    public String admin_goods_failure_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_modify";
    }

    @GetMapping("adminGoods/adminGoodsFailureRemove")
    public String admin_goods_failure_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_remove";
    }

    @GetMapping("adminGoods/adminGoodsFailureStandardManage")
    public String admin_goods_failure_standard_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_standard_main";
    }

    @GetMapping("adminGoods/adminGoodsFailureStandardCheck")
    public String admin_goods_failure_standard_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_standard_check";
    }

    @GetMapping("adminGoods/adminGoodsFailureStandardAdd")
    public String admin_goods_failure_standard_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_standard_add";
    }

    @GetMapping("adminGoods/adminGoodsFailureStandardModify")
    public String admin_goods_failure_standard_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_standard_modify";
    }

    @GetMapping("adminGoods/adminGoodsFailureStandardRemove")
    public String admin_goods_failure_standard_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_goods/admin_goods_failure_standard_remove";
    }
}
