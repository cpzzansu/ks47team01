package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminInfoController {

	@GetMapping("/adminInfo/adminSearchUser")
	public String adminSearchUser() {
		
		return "admin_info/search_user_admin";
	}
	
	@GetMapping("/adminInfo/adminRemoveUsers")
	public String adminRemoveUser() {
		
		return "admin_info/remove_user_admin";
	}
	
	@GetMapping("/adminInfo/adminUpdateInfo")
	public String adminUpdateInfo() {
		
		return "admin_info/update_admin_info";
	}
	
	@GetMapping("/adminInfo/hubcrewUpdateInfo")
	public String hubcrewUpdateInfo() {
		
		return "admin_info/update_hubcrew_info";
	}
				
}
