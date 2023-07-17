package ks47team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.Urbanfarmer;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserInfoController {
	
	private final UrbanfarmerService urbanfarmerService;
	
	/** 회원 정보 수정과 회원 탈퇴를 고르는 화면(폼)								
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/userInfoMain")
	public String userInfoPage(Model model) {
		
		model.addAttribute("title", "마이페이지");
		
		return "user_info/user_info_main";
		
	}
	/** 회원 탈퇴를 위한 패스워드 입력화면								
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/removeUserPwCheck")
	public String removeUserPwCheck(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "user_info/remove_user_pw_check";
		
	}
	/** 회원 정보수정을 위한 패스워드 입력화면																
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/updateUserInfoPwCheck")
	public String updateUserInfoPw(Model model) {
		
		model.addAttribute("title", "회원정보 비밀번호 확인");
		
		return "user_info/update_user_info_pw_check";
		
	}
	/** 회원 정보 수정을 위한 패스워드 입력화면								
	 * 
	 * @return 회원정보 수정화면으로 리다이렉트
	 */
	@PostMapping("/userInfo/updateUserInfoPwCheck")
	public String postUpdateUserInfoPw(Model model
									   , @RequestParam(value = "urbanfarmerPw")String urbanfarmerPw
									   , RedirectAttributes reAttr
									   , HttpSession session) {
		String urbanfarmerId = (String) session.getAttribute("S_id");
		Urbanfarmer urbanfarmerInfo = urbanfarmerService.getUserInfoById(urbanfarmerId);
		String pwCheck = urbanfarmerInfo.getUrbanfarmerPw();
		
		if(urbanfarmerPw.equals(pwCheck)) {
			
			return "redirect:/userInfo/updateUserInfo";
			
		}
		
		reAttr.addAttribute("msg", "비밀번호가 일치하지 않습니다");
		
		return"redirect:/userInfo/updateUserInfoPwCheck";
		
	}
	/** 회원 탈퇴 비밀번호를 확인하는 화면
	 * 
	 * @return 메인화면으로 리다이렉트
	 */
	@PostMapping("/userInfo/removeUserPwCheck")
	public String postRemoveUser(Model model
								, @RequestParam(value = "urbanfarmerPw")String urbanfarmerPw
								, HttpSession session) {
		
		String urbanfarmerId = (String) session.getAttribute("S_id");
		
		Urbanfarmer urbanfarmerInfo = urbanfarmerService.getUserInfoById(urbanfarmerId);
		String pwCheck = urbanfarmerInfo.getUrbanfarmerPw();
		
		if(urbanfarmerPw.equals(pwCheck)) {
			
			urbanfarmerService.removeUserInfo(urbanfarmerId);
			
			return "redirect:/userLogin/userLogout";
			
		}
		
		return "redirect:/userInfo/removeUserPwCheck";
		
	}
	/** 회원 정보 수정하는 화면																
	 * 
	 * @return
	 */
	@GetMapping("/userInfo/updateUserInfo")
	public String updateUserInfo(Model model
								,HttpSession session) {
		
		String urbanfarmerId = (String) session.getAttribute("S_id");
		
		Urbanfarmer urbanfarmer = urbanfarmerService.getUserInfoById(urbanfarmerId);
		urbanfarmer.getUrbanfarmerId();
		
		model.addAttribute("title", "회원정보수정");
		model.addAttribute("urbanfarmer", urbanfarmer);
		
		return "user_info/update_user_info";
		
	}
	/** 유저정보 유저쿠폰 배송지관리를 고르는 화면
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/userInfo/userInfoPage")
	public String userInfoMain(Model model) {
		
		model.addAttribute("title", "회원정보");
		
		return "user_info/user_info_page";
	} 
	
	@PostMapping("/userInfo/userInfoPage")
	public String updateUserInfoMain(Urbanfarmer urbanfarmer) {
		
		
		urbanfarmerService.updateUserInfo(urbanfarmer);
		
		
		return "redirect:/";
	}
}
