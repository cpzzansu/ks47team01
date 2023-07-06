package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("userCartController")
public class CartController {
	
	@GetMapping("/userCart/userCartMain")
	public String user_order_list(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_shop_cart/shop_cart_main.html";
	}
}
