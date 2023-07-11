package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminKit")
public class KitController {

	/**
	 * 키트관리 메인화면
	 */
	@GetMapping("/kitMain")
	public String kitMain() {
		
		return "admin_kit/kit_main";
	}
	
	/**
	 * 키트 등록화면
	 */
	@GetMapping("/addKit")
	public String addKit() {
		
		return "admin_kit/add_kit";
	}

	/**
	 * 키트 수정화면
	 */
	@GetMapping("/modifyKit")
	public String modifyKit() {
		
		return "admin_kit/modify_kit";
	}
	
	/**
	 * 키트 삭제화면
	 */
	@GetMapping("/removeKit")
	public String removeKit() {
		
		return "admin_kit/remove_kit";
	}
}
