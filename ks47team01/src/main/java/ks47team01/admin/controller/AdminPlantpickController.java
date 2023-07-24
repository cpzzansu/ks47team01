package ks47team01.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class AdminPlantpickController {

    /**
     * 관리자 - 플랜트픽 리스트 회원 화면
     * @param 
     * @return 
     */
    @GetMapping("/adminPlantPick/PlantPickUserList")
    public String AdminUserList(Model model){
    	model.addAttribute("title" ,"플랜트픽 회원 리스트");

        return "admin_plantpick/plantpick_user_list";
    }

    /**
     *  관리자 플랜트픽 리스트 회원 수정
     */
    @GetMapping("/adminPlantPick/PlantPickUserListUpdate")
    public String AminUserListUpdate(Model model) {
    	model.addAttribute("title","플렌트픽 회원 리스트 수정화면");
		return "admin_plantpick/plantpick_user_list_update";
    }
  
    }

