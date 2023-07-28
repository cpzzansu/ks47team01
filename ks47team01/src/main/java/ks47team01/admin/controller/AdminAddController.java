package ks47team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import ks47team01.admin.service.RegisterMail;
import ks47team01.admin.service.UrbanfarmAdminService;
import ks47team01.admin.service.UrbanfarmHubCrewService;
import ks47team01.common.dto.UrbanfarmAdmin;
import ks47team01.common.dto.UrbanfarmHub;
import ks47team01.common.dto.UrbanfarmHubCrew;
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
	
	@PostMapping("/adminAdd/adminAddForm")
	public String adminAddAction(UrbanfarmAdmin urbanfarmAdmin) {
		
		String Phone = "010-" + urbanfarmAdmin.getUrbanfarmAdminPhone();
		urbanfarmAdmin.setUrbanfarmAdminPhone(Phone);
		
		urbanfarmAdminService.addUrbanfarmAdmin(urbanfarmAdmin);
		
		return "redirect:/admin";
		
	}
	
	
	/** 허브크루 회원가입 화면(폼)								"								
	 * 
	 * @return 
	 */
	@GetMapping("/hubCrewAdd/hubcrewAddForm")
	public String hubAddForm(Model model) {
		
		List<UrbanfarmHub> hubList = urbanfarmHubCrewService.getUrbanfarmHubList();
		
		model.addAttribute("hubList", hubList);
		model.addAttribute("title", "urbanfarm");
		
		return "admin_add/hubcrew_add_form";
	}
	
	@PostMapping("/hubCrewAdd/hubcrewAddForm")
	public String hubCrewAddAction(UrbanfarmHubCrew urbanfarmHubCrew) {
		
		String Phone = "010-" + urbanfarmHubCrew.getUrbanfarmHubCrewPhone();
		urbanfarmHubCrew.setUrbanfarmHubCrewPhone(Phone);
		
		urbanfarmHubCrewService.addUrbanfarmHubCrew(urbanfarmHubCrew);
		
		
		return "redirect:/admin";
		
	}
	
	// 이메일 인증
	@PostMapping("/adminAdd/emailCheck")
	@ResponseBody
	String AdminEmailConfirm(@RequestParam("email") String email, HttpSession session) throws Exception {
		
		
	    
		/*
		 * List<UrbanfarmAdmin> EmailList =
		 * urbanfarmAdminService.getUrbanfarmAdminEmailList(email); boolean result =
		 * EmailList.isEmpty(); session.invalidate(); if(result == false) { String code
		 * = registerMail.sendSimpleMessage(email); session.setMaxInactiveInterval(180);
		 * session.setAttribute("emailCode", code);
		 * 
		 * System.out.println("인증코드 : " + code); return code;
		 * 
		 * }
		 */
	    
    	String code = registerMail.sendSimpleMessage(email);
    	session.setMaxInactiveInterval(180);
    	session.setAttribute("emailCode", code);
    	
    	System.out.println("인증코드 : " + code);
    	return code;
	    
	    
//	    return null;
	    
	}
	
	@GetMapping("/adminAdd/emailCheck") 
	public String adminMail(Model model, HttpSession session) {
		session.invalidate();
		return "admin_add/admin_send_mail";
		
	}
	
	@PostMapping("/adminAdd/emailCodeCheck")
	public String adminEmailCodeCheck(@RequestParam(value = "emailCode") String emailCode
								,HttpSession session) {
		
		if(emailCode.equals(session.getAttribute("emailCode"))) {
			
			return "redirect:/adminAdd/adminAddForm";
			
		}
		
		return "redirect:/adminAdd/emailCheck";
	
	}
	
	@GetMapping("/hubCrew/emailCheck")
	public String hubCrewMail(Model model, HttpSession session) {
		
		session.invalidate();
		return "admin_add/hubcrew_send_mail";
		
	}
	
	@PostMapping("/hubCrewAdd/emailCodeCheck")
	public String hubCrewEmailCodeCheck(@RequestParam(value = "emailCode") String emailCode
								,HttpSession session) {
		
		if(emailCode.equals(session.getAttribute("emailCode"))) {
			
			return "redirect:/hubCrewAdd/hubcrewAddForm";
			
		}
		
		return "redirect:/hubCrew/emailCheck";
	
	}
	
	@PostMapping("/hubCrewAdd/emailCheck")
	@ResponseBody
	String hubCrewEmailConfirm(@RequestParam("email") String email, HttpSession session) throws Exception {
		
		
	    
		/*
		 * List<UrbanfarmAdmin> EmailList =
		 * urbanfarmAdminService.getUrbanfarmAdminEmailList(email); boolean result =
		 * EmailList.isEmpty(); session.invalidate(); if(result == false) { String code
		 * = registerMail.sendSimpleMessage(email); session.setMaxInactiveInterval(180);
		 * session.setAttribute("emailCode", code);
		 * 
		 * System.out.println("인증코드 : " + code); return code;
		 * 
		 * }
		 */
	    
    	String code = registerMail.sendSimpleMessage(email);
    	session.setMaxInactiveInterval(180);
    	session.setAttribute("emailCode", code);
    	
    	System.out.println("인증코드 : " + code);
    	return code;
	    
	    
//	    return null;
	    
	}
	@ResponseBody
	@PostMapping("/adminAdd/adminIdCheck")
	public boolean adminIdCheck(@RequestParam(value = "urbanfarmAdminId") String urbanfarmAdminId) {
		
		boolean result = urbanfarmAdminService.idCheck(urbanfarmAdminId);
		
		return result;
		
	}
	
	@ResponseBody
	@PostMapping("/hubCrewAdd/hubCrewIdCheck")
	public boolean hubCrewIdCheck(@RequestParam(value = "urbanfarmHubCrewId") String urbanfarmHubCrewId) {
		
		boolean result = urbanfarmHubCrewService.urbanfarmHubCrewIdCheck(urbanfarmHubCrewId);
		
		return result;
		
	}
	

}
