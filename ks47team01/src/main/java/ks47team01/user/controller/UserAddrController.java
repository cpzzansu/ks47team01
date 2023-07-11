package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserAddrController {
	/** 배송지 목록 화면								
	 * 
	 * @return
	 */
	@GetMapping("/user/userAddrList")
	public String userAddrList(Model model) {
		
		model.addAttribute("title", "배송지 목록");
		
		return "user_addr/addr_user_list";
		
	}
	/** 배송지 등록 화면								                             				
	 * 
	 * @return 
	 */
	@GetMapping("/user/addUserAddr")
	public String addUserAddr(Model model) {
		
		model.addAttribute("title", "배송지 등록");
		
		return "user_addr/add_user_addr";
		
	}
	/** 배송지 삭제								 								
	 * 
	 * @return
	 */
	@GetMapping("/user/removeUserAddr")
	public String removeUserAddr(Model model) {
		
		model.addAttribute("title", "배송지 삭제");
		
		return "user_addr/remove_user_addr";
		
	}
	/** 배송지 수정 
	 * 
	 * @return
	 */
	@GetMapping("/user/updateUserAddr")
	public String updateUserAddr(Model model) {
		
		model.addAttribute("title", "배송지 수정");
		
		return "user_addr/update_user_addr";
		
	}
	
	
}
