package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminCrops")
public class CropsController {
	
	/**
	 * 작물 관리 메인화면
	 */
	@GetMapping("/cropsMain")
	public String cropsMain() {
		
		return "admin_crops/crops_main";
	}
	
	/**
	 * 작물 등록화면
	 */
	@GetMapping("/addCrops")
	public String addCrops() {
		
		return "admin_crops/add_crops";
	}
	
	/**
	 * 작물 수정화면
	 */
	@GetMapping("/modifyCrops")
	public String modifyCrops() {
		
		return "admin_crops/modify_crops";
	}
	
	/**
	 * 작물 삭제화면
	 */
	@GetMapping("/removeCrops")
	public String removeCrops() {
		
		return "admin_crops/remove_crops";
	}
}
