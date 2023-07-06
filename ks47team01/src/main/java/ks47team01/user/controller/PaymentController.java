package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("userPaymentController")
public class PaymentController {
	
	@GetMapping("/userPayment/userPaymentFail")
	public String user_order_processing(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_shop_payment/shop_payment_fail.html";
	}
	
	@GetMapping("/userPayment/userPaymentSuccess")
	public String user_order_detail(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_shop_payment/shop_payment_success.html";
	}
	
	@GetMapping("/userPayment/userPaymentMain")
	public String user_order_list(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_shop_payment/shop_payment_main.html";
	}
}
