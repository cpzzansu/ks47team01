package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserCouponController {
	/** 쿠폰 목록 화면
	 * 
	 * @return
	 */
	@GetMapping("/user/userCoupon")
	public String userCoupon(Model model) {
		
		model.addAttribute("title", "쿠폰 목록");
		
		return "user_coupon/coupon_user_list";
	}
	/** 쿠폰 등록 화면								
	 * 
	 * @return
	 */
	@GetMapping("/user/regiUserCoupon")
	public String regiUserCoupon(Model model) {
		
		model.addAttribute("title", "쿠폰 등록");

		return "user_coupon/regi_user_coupon";
	}
	
}
