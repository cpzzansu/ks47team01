package ks47team01.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.Urbanfarmer;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
@AllArgsConstructor
public class LoginController {
	
	private final UrbanfarmerService urbanfarmerService;
	

	/** 일반회원 로그인 화면								
	 * 
	 * @param model
	 * @return 
	 */
    @GetMapping("/userLogin/userLogin")
    public String loginForm(Model model, @RequestParam(value = "msg", required = false) String msg) {
        model.addAttribute("title", "로그인");
        if(msg != null) {
        	model.addAttribute("msg", msg);
        }
        
        return "user_login/user_login";
    }
    
    @PostMapping("/userLogin/userLogin")
    public String userLoginAction(@RequestParam(value = "urbanfarmerId")String urbanfarmerId, 
    							  @RequestParam(value = "urbanfarmerPw")String urbanfarmerPw,
    							  HttpServletRequest request,
    							  HttpServletResponse response,
    							  HttpSession session,
    							  RedirectAttributes reAttr) {
    	
    	Map<String, Object> validMap = urbanfarmerService.isValidUser(urbanfarmerId, urbanfarmerPw);
    	
    	boolean isValid = (boolean) validMap.get("isValid");
    	
    	Urbanfarmer urbanfarmer = urbanfarmerService.getUserInfoById(urbanfarmerId);
    	
    	if(isValid) {
    		Urbanfarmer urbanfarmerInfo = (Urbanfarmer) validMap.get("urbanfarmerInfo");
    		
    		String urbanfarmerName = urbanfarmerInfo.getUrbanfarmerName();
     		session.setAttribute("S_id", urbanfarmerId);
    		session.setAttribute("S_name", urbanfarmerName);
    		
    		return "redirect:/index";
    	} 
    	
    	reAttr.addAttribute("msg", "일치하는 회원의 정보가 없습니다.");
    	
    	return "redirect:/userLogin/userLogin";
    	
    }
    
    @GetMapping("/userLogin/userLogout")
    public String logoutUser(HttpSession session) {
    	
    	session.invalidate();
    	
    	return "redirect:/index";
    }
    

}
