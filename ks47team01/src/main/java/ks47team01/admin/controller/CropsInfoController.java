package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminCropsInfo")
public class CropsInfoController {

	@GetMapping("/addCropsInfo")
	public String addCropsInfo() {
		
		return "admin_crops_info/add_crops_info";
	}
	
	@GetMapping("/cropsInfoMain")
	public String cropsInfoMain() {
		
		return "admin_crops_info/crops_info_main";
	}
	
	@GetMapping("/modifyCropsInfo")
	public String modifyCropsInfo() {
		
		return "admin_crops_info/modify_crops_info";
	}
	
	@GetMapping("/removeCropsInfo")
	public String removeCropsInfo() {
		
		return "admin_crops_info/remove_crops_info";
	}
}
