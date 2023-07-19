package ks47team01.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.IssuedCoupon;
import ks47team01.user.service.UrbanfarmerCouponService;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserCouponController {
	
	private final UrbanfarmerCouponService urbanfarmerCouponService;
	
	/** 쿠폰 목록 화면
	 * 
	 * @return
	 */
	@GetMapping("/user/userCoupon")
	public String userCoupon(Model model
							,HttpSession session) {
		
		String urbanfarmerId = (String) session.getAttribute("S_id");
		
		List<Map<String, Object>> urbanfarmerCouponList = urbanfarmerCouponService.getUrbanfarmerCouponInfoById(urbanfarmerId);
		
		model.addAttribute("title", "쿠폰 목록");
		model.addAttribute("urbanfarmerCouponList", urbanfarmerCouponList);
		
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
	
	@PostMapping("/user/regiUserCoupon")
	public String regiUserCouponCheck(Model model, 
									@RequestParam(value = "issuedCouponId") String issuedCouponId,
									HttpSession session) {
		return null;
		
	}
		
	
}
