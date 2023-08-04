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
public class SaleReservationController {

    private final SaleReservationService saleReservationService;

    /**
     * 유저-허브 판매 예약 폼 화면 이동
     * @param model
     * @return user_sale_hub_reservation/sale_crop_to_hub_reservation_form
     */
    @GetMapping("/userSaleHubReservation/saleReservation")
    public String moveSaleReservation(Model model) {

        model.addAttribute("title", "허브 판매 예약");

        return "user_sale_hub_reservation/sale_crop_to_hub_reservation";
    }

    /**
     * 유저-허브 판매 예약 목록 화면 이동
     * @param model
     * @return user_sale_hub_reservation/list_sale_crop_to_hub_reservation
     */
    @GetMapping("/userSaleHubReservation/listSaleReservation")
    public String moveListSaleReservation(Model model) {

        model.addAttribute("title", "판매예약목록");

        return "user_sale_hub_reservation/list_sale_crop_to_hub_reservation";
    }

    /**
     * 유저-예약 상세 화면 이동
     * @param model
     * @return user_sale_hub_reservation/sale_crop_to_hub_reservation_detail
     * @throws IOException
     * @throws WriterException
     */
    @GetMapping("/userSaleHubReservation/saleReservationDetail")
    public String moveSaleReservationDetail(Model model) throws IOException, WriterException {

        String qrCodeData = saleReservationService.generateQRCodeImage("Hello World!", 350, 350);

        model.addAttribute("title", "예약상세");
        model.addAttribute("qrCode", qrCodeData);

        return "user_sale_hub_reservation/sale_crop_to_hub_reservation_detail";
    }


    @GetMapping("/userSaleHubReservation/modifySaleReservation")
    public String moveModifyReservation(Model model){
        model.addAttribute("title","예약 수정 화면");

        return "user_sale_hub_reservation/modify_sale_crop_to_hub_reservation";
    }
}