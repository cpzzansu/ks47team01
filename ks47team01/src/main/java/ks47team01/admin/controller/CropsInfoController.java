package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminCropsInfo")
public class CropsInfoController {

	
	/**
	 * 작물별 재배정보 관리 메인화면
	 */
	@GetMapping("/cropsInfoMain")
	public String cropsInfoMain() {
		
		return "admin_crops_info/crops_info_main";
	}
	
	/**
	 * 작물별 재배정보 등록화면
	 */
	@GetMapping("/addCropsInfo")
	public String addCropsInfo() {
		
		return "admin_crops_info/add_crops_info";
	}
	
	/**
	 * 작물별 재배정보 수정화면
	 */
	@GetMapping("/modifyCropsInfo")
	public String modifyCropsInfo() {
		
		return "admin_crops_info/modify_crops_info";
	}
	
	/**
	 * 작물별 재배정보 삭제화면
	 */
	@GetMapping("/removeCropsInfo")
	public String removeCropsInfo() {
		
		return "admin_crops_info/remove_crops_info";
	}
}
