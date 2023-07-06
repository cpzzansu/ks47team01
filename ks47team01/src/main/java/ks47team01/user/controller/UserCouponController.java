package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserCouponController {
	
	@GetMapping("/user/userCoupon")
	public String userCoupon() {
		
		
		
		return "user_coupon/coupon_user_list";
	}
	
	@GetMapping("/user/regiUserCoupon")
	public String regiUserCoupon() {

		return "user_coupon/regi_user_coupon";
	}
	
}
