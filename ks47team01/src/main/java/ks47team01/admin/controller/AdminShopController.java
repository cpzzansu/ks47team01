package ks47team01.admin.controller;

import ks47team01.admin.service.AdminShopService;
import ks47team01.common.dto.GoodsKit;
import ks47team01.common.dto.GoodsLabel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("adminShopController")
@AllArgsConstructor
@Slf4j
public class AdminShopController {

    private final AdminShopService adminShopService;



    /**
     * 상점상품 수정화면에 수정할 상품 데이터 받아오기
     * @param checkedData
     * @return
     */
    /**
    @GetMapping("adminShop/adminShopUpdate")
    public String admin_shop_update_obj(@RequestParam("checkedData") String checkedData, Model model){
        String finalCheckedData = checkedData;

        System.out.println(finalCheckedData);

        GoodsKit goodsKitObj = adminShopService.getGoodsKitObj(finalCheckedData);

        model.addAttribute("GoodsKit", goodsKitObj);

        System.out.println(goodsKitObj);

        return "admin_shop/admin_shop_modify";
    }
    */

    /**
     * 상점상품 삭제 후 Reload(안씀)
     * @param goodsKit
     * @return
     */
    /*
    @GetMapping("adminShop/adminShopReload")
    @ResponseBody
    public Map<String,Object> admin_shop_reload(GoodsKit goodsKit) {

        Map<String, Object> data = new HashMap<String, Object>();
        List<GoodsKit> goodsKitList = new ArrayList<>();

        data.put("data", goodsKitList);

        System.out.println("remove단 paramMap: " + data);

        return data;
    }
    */

    /**
     * 상점상품 삭제 기능
     * @param checkedData
     * @return
     */
    @PostMapping("adminShop/adminShopLabelRemove")
    @ResponseBody
    public String admin_shop_remove_obj(@RequestBody Map<String, Object> checkedData){
        List<String> finalCheckedData = (List<String>) checkedData.get("checkedData");

        System.out.println(finalCheckedData);

        adminShopService.removeGoodsKitList(finalCheckedData);

        return "admin_shop/admin_shop_label_remove";
    }

    /**
     * 상점상품관리 테이블에 들어갈 goods_kit 테이블 데이터
     * @return
     */
    @ResponseBody
    @GetMapping("/adminShop/adminShopManageData")
    public List<GoodsKit> admin_shop_data() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<GoodsKit> goodsKitList = adminShopService.getGoodsKitList(paramMap);

        paramMap.put("data", goodsKitList);

        return goodsKitList;
    }

    @ResponseBody
    @GetMapping("/adminShop/adminShopLabelManageData")
    public List<GoodsLabel> admin_shop_label_data() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<GoodsLabel> goodsLabelList = adminShopService.getGoodsLabelList(paramMap);

        paramMap.put("data", goodsLabelList);

        return goodsLabelList;
    }

    /**
     * 상점상품 관리 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopManage")
    public String adminShopMain(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_main";
    }

    /**
     * 상점상품 등록 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopAdd")
    public String admin_shop_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_add";
    }

    /**
     * 상점상품 수정 맵핑
     * @param model
     * @return
     */
    @GetMapping ("adminShop/adminShopUpdate")
    public String admin_shop_modify(@RequestParam(value="goodsKitCode") String finalCheckedData, Model model) {

        System.out.println(finalCheckedData);

        GoodsKit goodsKitObj = adminShopService.getGoodsKitObj(finalCheckedData);

        model.addAttribute("GoodsKit", goodsKitObj);

        System.out.println(goodsKitObj);

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_modify";
    }

    /**
     * 상점상품 삭제 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopRemove")
    public String admin_shop_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_remove";
    }

    /**
     * 상점상품라벨 관리 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopLabelManage")
    public String admin_shop_label_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_main";
    }

    /**
     * 상점상품라벨 등록 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopLabelAdd")
    public String admin_shop_label_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_add";
    }

    /**
     * 상점상품라벨 수정 기능
     * @param checkedData
     * @return
     */
    @PostMapping("adminShop/adminShopLabelUpdate")
    @ResponseBody
    public GoodsLabel admin_shop_label_update_obj(@RequestParam("checkedData") String checkedData){
        String finalCheckedData = checkedData;

        System.out.println(finalCheckedData);

        GoodsLabel goodsLabelObj = adminShopService.getGoodsLabelObj(finalCheckedData);

        System.out.println(goodsLabelObj);

        return goodsLabelObj;
    }

    /**
     * 상점상품라벨 수정 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopLabelModify")
    public String admin_shop_label_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_modify";
    }

    /**
     * 상점상품라벨 삭제 기능
     * @param checkedData
     * @return
     */
    @PostMapping("adminShop/adminShopLabelDelete")
    @ResponseBody
    public String admin_shop_label_delete_obj(@RequestBody Map<String, Object> checkedData){
        List<String> finalCheckedData = (List<String>) checkedData.get("checkedData");

        System.out.println(finalCheckedData);

        adminShopService.deleteGoodsLabelList(finalCheckedData);

        return "admin_shop/admin_shop_label_delete";
    }

    /**
     * 상점상품라벨 삭제 맵핑
     * @param model
     * @return
     */
    @GetMapping("adminShop/adminShopLabelRemove")
    public String admin_shop_label_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_shop/admin_shop_label_remove";
    }

}
