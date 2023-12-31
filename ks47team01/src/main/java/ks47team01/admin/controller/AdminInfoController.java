package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminInfoController {
	/** 회원 조회	화면
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/adminSearchUser")
	public String adminSearchUser(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/search_user_admin";
	}
	/** 회원 삭제(관리자)								
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/adminRemoveUsers")
	public String adminRemoveUser(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/remove_user_admin";
	}
	/** 직원 정보 수정								
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/adminUpdateInfo")
	public String adminUpdateInfo(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/update_admin_info";
	}
	/** 허브직원 정보 수정								
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/hubcrewUpdateInfo")
	public String hubcrewUpdateInfo(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/update_hubcrew_info";
	}
				
}
