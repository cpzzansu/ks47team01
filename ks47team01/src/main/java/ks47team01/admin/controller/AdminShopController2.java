package ks47team01.admin.controller;

import ks47team01.admin.service.AdminShopService;
import ks47team01.common.dto.GoodsKit;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller("adminShopController")
@AllArgsConstructor
@Slf4j
public class AdminShopController2 {

    private final AdminShopService adminShopService;

    @GetMapping("adminShop/adminShopReload")
    @ResponseBody
    public Map<String,Object> admin_shop_reload(GoodsKit goodsKit) {

        Map<String, Object> data = new HashMap<String, Object>();
        List<GoodsKit> goodsKitList = new ArrayList<>();

        data.put("data", goodsKitList);

        System.out.println("remove단 paramMap: " + data);

        return data;
    }
    @PostMapping("adminShop/adminShopRemove")
    @ResponseBody
    public String admin_shop_remove_obj(@RequestBody Map<String, Object> checkedData){
        List<String> finalCheckedData = (List<String>) checkedData.get("checkedData");

        System.out.println(finalCheckedData);

        adminShopService.removeGoodsKitList(finalCheckedData);

        return "admin_shop/admin_shop_label_remove";
    }

    @GetMapping("adminShop/adminShopManage")
    public String admin_shop_main(Model model) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<GoodsKit> goodsKitList = adminShopService.getGoodsKitList(paramMap);

        model.addAttribute("title", "urbanfarm");
        model.addAttribute("goodsKitList", goodsKitList);
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