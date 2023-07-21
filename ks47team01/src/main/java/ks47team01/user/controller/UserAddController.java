package ks47team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks47team01.common.dto.Urbanfarmer;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@AllArgsConstructor
@Slf4j
public class UserAddController {
	
	private final UrbanfarmerService urbanfarmerService;
	
	/** 일반회원 회원가입 화면(폼)								
	 *  
	 * @param model
	 * @return 
	 */
    @GetMapping("/userAdd/userAddForm")
    public String userAddForm(Model model) {
    	
    	
        model.addAttribute("title", "회원가입");
        
        return "user_add/user_add_form";
        
    }
    
    @PostMapping("/userAdd/userAddForm")
    public String userInsertAction(Urbanfarmer urbanfarmer) {
    	
    	String phone = "010-" + urbanfarmer.getUrbanfarmerPhone();
    	urbanfarmer.setUrbanfarmerPhone(phone);
    	
    	urbanfarmerService.addUrbanfarmer(urbanfarmer);
    	
    	return "redirect:/index";
    }
    
    @PostMapping("/userAdd/userIdCheck")
    @ResponseBody
    public boolean idCheck(@RequestParam(value = "urbanfarmerId")String urbanfarmerId) {
    	
    	log.info("id 중복체크: {}", urbanfarmerId);
    	boolean result = urbanfarmerService.idCheck(urbanfarmerId);
    	log.info("id 중복체크 결과: {}", result);
    	
    	return result;
    	
    }

}
