package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminAddrController {
	/** 유저의 배송지 목록																"								
	 * 
	 * @return 
	 */
	@GetMapping("/adminAddr/adminAddrList")
	public String adminAddrList() {
		
		return "admin_addr/addr_admin_list";
		
	}
	/** 유저의 배송지 삭제								
	 * 
	 * @return 
	 */
	@GetMapping("/adminAddr/adminRemoveAddr")
	public String adminRemoveAddr() {
		
		return "admin_addr/remove_admin_addr";
		
	} 
	/** 유저의 배송지 조회								
	 * 
	 * @return 
	 */
	@GetMapping("/adminAddr/adminSearchAddr")
	public String adminSearchAddr() {
		
		return "admin_addr/search_admin_addr";
		
	}
	/** 유저의 배송지 수정								
	 * 
	 * @return 
	 */
	@GetMapping("/adminAddr/adminUpdateAddr")
	public String adminUpdateAddr() {
		
		return "admin_addr/update_admin_addr";
		
	}	
	
}
