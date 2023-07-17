package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.IssuedCoupon;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserCouponController {
	
	private final UrbanfarmerService urbanfarmerService;
	
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
	
	@PostMapping("/user/regiUserCoupon")
	public String regiUserCouponCheck(Model model, 
									@RequestParam(value = "issuedCouponId") String issuedCouponId,
									HttpSession session) {
		
		IssuedCoupon issuedCoupon = urbanfarmerService.getCouponInfo(issuedCouponId);
		
		if(issuedCoupon != null && issuedCoupon.getUrbanfarmerId() == null) {
			
			int number = urbanfarmerService.getCouponInfoValidDays(issuedCoupon.getCouponInformationId());
			String urbanfarmerId = (String) session.getAttribute("S_id");
			IssuedCoupon couponUpdate = urbanfarmerService.addUrbanfarmerCoupon(issuedCouponId);
			couponUpdate.setCouponHistoryDelDate("DATE_ADD(CURDATE(), interval " + number + " DAY)");
			couponUpdate.setUrbanfarmerId(urbanfarmerId);
			return "redirect:/user/userCoupon";
		}
		
		return("redirect:/user/regiUserCoupon");
		
	}
	
}
