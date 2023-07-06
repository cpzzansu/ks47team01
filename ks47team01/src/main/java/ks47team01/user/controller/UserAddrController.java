package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAddrController {
	
	@GetMapping("/user/userAddrList")
	public String userAddrList() {
		
		return "user_addr/addr_user_list";
		
	}
	@GetMapping("/user/addUserAddr")
	public String addUserAddr() {
		
		return "user_addr/add_user_addr";
		
	}
	@GetMapping("/user/removeUserAddr")
	public String removeUserAddr() {
		
		return "user_addr/remove_user_addr";
		
	}
	@GetMapping("/user/updateUserAddr")
	public String updateUserAddr() {
		
		return "user_addr/update_user_addr";
		
	}
	
	
}
