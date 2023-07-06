package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("userShopController")
public class ShopController {

	@GetMapping("/userShop/userShopDetail")
	public String user_shop_detail(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_shop/shop_detail.html";
	}
	
	@GetMapping("/userShop/userShopList")
	public String user_shop_list(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_shop/shop_main.html";
	}
}
