package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminAddController {
	/** 관리자 회원가입 화면(폼)								"								
	 * 
	 * @return 			
	 */
	@GetMapping("/adminAdd/adminAddForm")
	public String adminAddForm(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_add/admin_add_form";
	}
	/** 허브크루 회원가입 화면(폼)								"								
	 * 
	 * @return 
	 */
	@GetMapping("/adminAdd/hubcrewAddForm")
	public String hubAddForm(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_add/hubcrew_add_form";
	}

}
