package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminCouponController {
	
	/** 쿠폰 생성 화면													
	 * 
	 * @return 
	 */
	@GetMapping("/adminCoupon/addAdminCoupon")
	public String adminAddCoupon(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_coupon/add_admin_coupon";
	}
	/** 쿠폰 목록	화면										
	 * 
	 * @return 
	 */
	@GetMapping("/adminCoupon/adminCouponList")
	public String adminCouponList(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_coupon/coupon_admin_list";
	}
	/** 쿠폰 삭제	화면						
	 * 
	 * @return 
	 */
	@GetMapping("/adminCoupon/adminDeleteCoupon")
	public String adminDeleteCoupon(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_coupon/delete_admin_coupon";
	}
	/** 쿠폰 수정	화면					
	 * 
	 * @return 
	 */
	@GetMapping("/adminCoupon/adminUpdateCoupon")
	public String adminUpdateCoupon(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_coupon/update_admin_coupon";
	}

}
