package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserCouponController {
	/** 쿠폰 목록 화면
	 * 
	 * @return
	 */
	@GetMapping("/user/userCoupon")
	public String userCoupon() {
		
		
		
		return "user_coupon/coupon_user_list";
	}
	/** 쿠폰 등록 화면								
	 * 
	 * @return
	 */
	@GetMapping("/user/regiUserCoupon")
	public String regiUserCoupon() {

		return "user_coupon/regi_user_coupon";
	}
	
}
