package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class saleReservationController {
    
    @GetMapping("/userSaleHubReservation/saleReservationForm")
    public String saleReservation(Model model){
        
        model.addAttribute("title","허브 판매 예약");
        
        return "user_sale_hub_reservation/sale_crop_to_hub_reservation_form";
    }

    @GetMapping("/userSaleHubReservation/listSaleReservation")
    public String listSaleReservation(Model model){

        model.addAttribute("title","");

        return "user_sale_hub_reservation/list_sale_crop_to_hub_reservation";
    }

}
