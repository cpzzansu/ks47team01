package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminKit")
public class KitController {

	@GetMapping("/kitMain")
	public String kitMain() {
		
		return "admin_kit/kit_main";
	}
	
	@GetMapping("/addKit")
	public String addKit() {
		
		return "admin_kit/add_kit";
	}

	@GetMapping("/modifyKit")
	public String modifyKit() {
		
		return "admin_kit/modify_kit";
	}
	
	@GetMapping("/removeKit")
	public String removeKit() {
		
		return "admin_kit/remove_kit";
	}
}
