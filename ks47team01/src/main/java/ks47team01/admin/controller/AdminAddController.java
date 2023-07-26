package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks47team01.admin.service.RegisterMail;
import ks47team01.admin.service.UrbanfarmAdminService;
import ks47team01.admin.service.UrbanfarmHubCrewService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AdminAddController {
	
	private final UrbanfarmAdminService urbanfarmAdminService;
	private final UrbanfarmHubCrewService urbanfarmHubCrewService;
	private final RegisterMail registerMail;
	
	
	@GetMapping("/adminAdd/addMainForm")
	public String addMainForm() {
		
		
		return "admin_add/add_main";
	}
	
	
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
	
	// 이메일 인증
	@PostMapping("/login/mailCheck")
	@ResponseBody
	String mailConfirm(@RequestParam("email") String email) throws Exception {

	   String code = registerMail.sendSimpleMessage(email);
	   System.out.println("인증코드 : " + code);
	   return code;
	}
	
	@GetMapping("/login/mailConfirm") 
	String mail(Model model) {
		
		return "admin_add/admin_send_mail";
		
	}

}
