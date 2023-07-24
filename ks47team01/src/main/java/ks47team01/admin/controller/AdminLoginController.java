package ks47team01.admin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ks47team01.admin.service.UrbanfarmAdminService;
import ks47team01.admin.service.UrbanfarmHubCrewService;
import ks47team01.common.dto.UrbanfarmAdmin;
import ks47team01.common.dto.UrbanfarmHubCrew;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@AllArgsConstructor
@Slf4j
public class AdminLoginController {
	
	private final UrbanfarmAdminService urbanfarmAdminService;
	private final UrbanfarmHubCrewService urbanfarmHubCrewService;
	
	
	@GetMapping("/adminLogin/adminLogin")
	public String AdminLogin() {
		
		return "admin_login/admin_login";
		
	}
	
	@PostMapping("/adminLogin/adminLogin")
	public String AdminCheckLogin(@RequestParam(value = "urbanfarmAdminId") String urbanfarmAdminId,
								  @RequestParam(value = "urbanfarmAdminPw") String urbanfarmAdminPw,
	  							  HttpServletRequest request,
	  							  HttpServletResponse response,
	  							  HttpSession session,
	  							  RedirectAttributes reAttr) {
		
		Map<String, Object> validMap = urbanfarmAdminService.isValidUser(urbanfarmAdminId, urbanfarmAdminPw);
		
		boolean isValid = (boolean) validMap.get("isValid");
		
		if(isValid) {
			
			UrbanfarmAdmin urbanfarmAdminInfo = (UrbanfarmAdmin) validMap.get("urbanfarmAdminInfo");
			session.setAttribute("UA_id",urbanfarmAdminId);
			session.setAttribute("UA_name", urbanfarmAdminInfo.getUrbanfarmAdminName());
			
			return "redirect:/admin";
		}
		
		
		return "redirect:/adminLogin/adminLogin";
		
	}
	
	@PostMapping("/adminLogin/hubcrewLogin")
	public String loginHubCrew(@RequestParam(value = "urbanfarmHubCrewId") String urbanfarmHubCrewId,
			  				   @RequestParam(value = "urbanfarmHubCrewPw") String urbanfarmHubCrewPw,
			  				   HttpServletRequest request,
			  				   HttpServletResponse response,
			  				   HttpSession session,
			  				   RedirectAttributes reAttr) {
		
		Map<String, Object> validMap = urbanfarmHubCrewService.isValidUser(urbanfarmHubCrewId, urbanfarmHubCrewPw);
		
		boolean isValid = (boolean) validMap.get("isValid");
		
		if(isValid) {
			
			UrbanfarmHubCrew hubCrewInfo = (UrbanfarmHubCrew) validMap.get("hubCrewInfo");
			session.setAttribute("HC_id", hubCrewInfo.getUrbanfarmHubCrewId());
			session.setAttribute("HC_name", hubCrewInfo.getUrbanfarmHubCrewName());
			
			return "redirect:/admin";
			
		}
		
		
		return "redirect:/adminLogin/hubcrewLogin";
		
	}
	
	
	@GetMapping("/adminLogin/hubcrewLogin")
	public String HubcrewLogin() {
		
		
		return "admin_login/hubcrew_login";
		
	}
	
	@GetMapping("/adminLogin/adminLogout")
	public String logoutAdmin(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/admin";
	}
	

}
