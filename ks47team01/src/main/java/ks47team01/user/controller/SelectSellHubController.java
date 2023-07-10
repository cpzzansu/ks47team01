package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectSellHubController {

    //판매할 허브 선택하기
    @GetMapping("/userSelectselltohub/selectsellHub")
    public String selectsellHub(Model model){

        model.addAttribute("title","작물을 판매할 허브 선택");

        return "user_select_selltohub/select_sell_hub";
    }

    // 판매할 작물 플랜에서 선택하기
    @GetMapping ("/userSelectselltohub/selectsellCrop")
    public String sellCropSelect(Model model){

        model.addAttribute("title","판매 작물 선택");

        return "user_select_selltohub/select_sell_crop";
    }
}
