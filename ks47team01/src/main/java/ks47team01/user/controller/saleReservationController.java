package ks47team01.user.controller;

import com.google.zxing.WriterException;
import ks47team01.user.service.SaleReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@AllArgsConstructor
@Controller
public class saleReservationController {

    private final SaleReservationService saleReservationService;

    @GetMapping("/userSaleHubReservation/saleReservationForm")
    public String saleReservation(Model model) {

        model.addAttribute("title", "허브 판매 예약");

        return "user_sale_hub_reservation/sale_crop_to_hub_reservation_form";
    }

    @GetMapping("/userSaleHubReservation/listSaleReservation")
    public String listSaleReservation(Model model) {

        model.addAttribute("title", "판매예약목록");

        return "user_sale_hub_reservation/list_sale_crop_to_hub_reservation";
    }

    @GetMapping("/userSaleHubReservation/saleReservationDetail")
    public String saleReservationDetail(Model model) throws IOException, WriterException {

        String qrCodeData = saleReservationService.generateQRCodeImage("Hello World!", 350, 350);

        model.addAttribute("title", "예약상세");
        model.addAttribute("qrCode", qrCodeData);

        return "user_sale_hub_reservation/sale_crop_to_hub_reservation_detail";
    }
}

