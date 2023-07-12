package ks47team01.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String loginForm(Model model) {
        model.addAttribute("title", "로그인");
        
        return "user_login/user_login";
    }
    
    @PostMapping("/userLogin/userLogin")
    public String userLoginAction(@RequestParam(value = "urbanfarmerId")String urbanfarmerId, 
    							  @RequestParam(value = "urbanfarmerPw")String urbanfarmerPw,
    							  RedirectAttributes reAttr) {
    	
    	Map<String, Object> validMap = urbanfarmerService.isValidUser(urbanfarmerId, urbanfarmerPw);
    	
    	boolean isValid = (boolean) validMap.get("isValid");
    	
    	if(isValid) {
    		
    		return "redirect:/";
    		
    	} 
    	
    	
    	return "userLogin/userLogin";
    	
    }
    

}
