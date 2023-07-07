package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminAddController {
	
	@GetMapping("/adminAdd/adminAddForm")
	public String adminAddForm() {
		
		
		return "admin_add/admin_add_form";
	}
	
	@GetMapping("/adminAdd/hubcrewAddForm")
	public String hubAddForm() {
		
		
		return "admin_add/hubcrew_add_form";
	}

}
