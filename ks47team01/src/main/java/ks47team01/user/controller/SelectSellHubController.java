package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectSellHubController {

    

    /**
     * 유저-판매할 허브 선택하기 화면 이동
     * @param model
     * @return user_select_sell_to_hub/select_sell_hub
     */
    @GetMapping("/userSelectSellToHub/selectSellHub")
    public String moveSelectSellHub(Model model){

        model.addAttribute("title","작물을 판매할<br>허브 선택");

        return "user_select_sell_to_hub/select_sell_hub";
    }

    /**
     * 유저-판매할 작물 플랜에서 선택하기 화면 이동
     * @param model
     * @return user_select_sell_to_hub/select_sell_crop
     */
    @GetMapping ("/userSelectSellToHub/selectSellCrop")
    public String moveSellCropSelect(Model model){

        model.addAttribute("title","허브에 작물<br>판매하기!");

        return "user_select_sell_to_hub/select_sell_crop";
    }
}
