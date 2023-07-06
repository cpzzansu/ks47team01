package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("adminCrops")
public class CropsController {
	
	@GetMapping("/cropsMain")
	public String cropsMain() {
		
		return "admin_crops/crops_main";
	}
	
	@GetMapping("/addCrops")
	public String addCrops() {
		
		return "admin_crops/add_crops";
	}
	
	@GetMapping("/modifyCrops")
	public String modifyCrops() {
		
		return "admin_crops/modify_crops";
	}
	
	@GetMapping("/removeCrops")
	public String removeCrops() {
		
		return "admin_crops/remove_crops";
	}
}
