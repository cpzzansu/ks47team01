package ks47team01.admin.controller;

import ks47team01.admin.service.AdminGoodsService;
import ks47team01.common.dto.GoodsBadStock;
import ks47team01.common.dto.GoodsBadStockCategory;
import ks47team01.common.dto.GoodsInventory;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("adminGoodsController")
@AllArgsConstructor
@Slf4j
public class AdminGoodsController {

    private final AdminGoodsService adminGoodsService;

    /**
     * 불량상품재고기준 리스트 불러오기
     * @return
     */
    @ResponseBody
    @GetMapping("/adminGoods/adminGoodsBadStockCategoryData")
    public List<GoodsBadStockCategory> admin_goods_bad_stock_category_data() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<GoodsBadStockCategory> goodsBadStockCategoryList = adminGoodsService.adminGoodsBadStockCategoryData(paramMap);

        paramMap.put("data", goodsBadStockCategoryList);

        return goodsBadStockCategoryList;
    }

    /**
     * 불량상품재고 리스트 불러오기
     * @return
     */
    @ResponseBody
    @GetMapping("/adminGoods/adminGoodsBadStockData")
    public List<GoodsBadStock> admin_goods_bad_stock_data() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<GoodsBadStock> goodsBadStockList = adminGoodsService.adminGoodsBadStockData(paramMap);

        paramMap.put("data", goodsBadStockList);

        return goodsBadStockList;
    }

    /**
     * 상품재고 리스트 불러오기
     * @return
     */
    @ResponseBody
    @GetMapping("/adminGoods/adminGoodsManageData")
    public List<GoodsInventory> admin_goods_data() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<GoodsInventory> goodsList = adminGoodsService.adminGoodsData(paramMap);

        paramMap.put("data", goodsList);

        return goodsList;
    }

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
