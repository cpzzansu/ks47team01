package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminCouponController {
	
	@GetMapping("/adminCoupon/addAdminCoupon")
	public String adminAddCoupon() {
		
		return "admin_coupon/add_admin_coupon";
	}
	
	@GetMapping("/adminCoupon/adminCouponList")
	public String adminCouponList() {
		
		return "admin_coupon/coupon_admin_list";
	}
	
	@GetMapping("/adminCoupon/adminDeleteCoupon")
	public String adminDeleteCoupon() {
		
		return "admin_coupon/delete_admin_coupon";
	}
	
	@GetMapping("/adminCoupon/adminUpdateCoupon")
	public String adminUpdateCoupon() {
		
		return "admin_coupon/update_admin_coupon";
	}

}
