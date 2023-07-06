package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("userOrderController")
public class OrderController {
	
	@GetMapping("/userOrder/userOrderReceipt")
	public String user_shop_list(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_order/order_receipt.html";
	}
	
	@GetMapping("/userOrder/userOrderProcessing")
	public String user_order_processing(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_order/order_processing.html";
	}
	
	@GetMapping("/userOrder/userOrderDetail")
	public String user_order_detail(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_order/order_detail.html";
	}
	
	@GetMapping("/userOrder/userOrderList")
	public String user_order_list(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_order/order_main.html";
	}
}
