package ks47team01.admin.controller;

import com.google.zxing.qrcode.decoder.Mode;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/adminHebReservation")
public class AdminHubReservationController {

    /**
     * 관리자-수확물 판매 예약 목록 화면 이동
     * @param model
     * @return admin_hub_reservation/list_hub_reservation
     */
    @GetMapping("/listHubReservation")
    public String moveListHubReservation(Model model){

        model.addAttribute("title", "관리자:수확물 판매 예약 목록");

        return "admin_hub_reservation/list_hub_reservation";
    }

    /**
     * 관리자-수확물 판매 예약 등록 화면 이동
     * @param model
     * @return admin_hub_reservation/add_hub_reservation
     */
    @GetMapping("addHubReservation")
    public String moveAddReservationForm(Model model){

        model.addAttribute("title", "관리자:수확물 판매 예약 등록");

        return "admin_hub_reservation/add_hub_reservation";
    }

    /**
     * 관리자-수확물 판매 예약 수정 화면 이동
     * @param model
     * @return admin_hub_reservation/modify_hub_reservation
     */
    @GetMapping("modifyHubReservation")
    public String moveModifyReservationForm(Model model){

        model.addAttribute("title","관리자:수확물 판매 예약 수정");

        return "admin_hub_reservation/modify_hub_reservation";
    }

    /**
     * 관리자-수확물 판매 예약 삭제
     * @param model
     * @return
     */
    @GetMapping("removeHubReservation")
    public String removeReservation(Model model){

        return "admin_hub_reservation/remove_hub_reservation";
    }
}
