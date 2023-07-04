package ks47team01.user.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ks47team01.user.service.CommonService;

@Controller("userCommonController")
public class CommonController {

		private final CommonService commonService;
		
		public CommonController(@Qualifier("userCommonService") CommonService commonService) {
			this.commonService = commonService;
		}
		
		@GetMapping("/Ushop/user_shop_payment_fail")
		public String user_shop_payment_fail(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/shop/shopping_payment_fail";	
		}
		
		@GetMapping("/Ushop/user_shop_payment_success")
		public String user_shop_payment_success(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/shop/shopping_payment_success";	
		}
		
		@GetMapping("/Uplant_pic/main")
		public String user_plant_pic_main(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/plant_pic/plant_pic_main";
		}
		
		@GetMapping("/Ushop/user_shop_payment")
		public String user_shop_payment(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/shop/shopping_payment";
		}
		
		@GetMapping("/Ushop/user_shop_cart")
		public String user_shop_cart(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/shop/shopping_cart";
		}
		
		@GetMapping("/Ushop/user_shop_detail")
		public String user_shop_detail(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/shop/shopping_detail";
		}
		
		@GetMapping("/Ushop/user_shop_list")
		public String user_shop_list(Model model) {
			model.addAttribute("title", "urbanfarm");
			return "user/shop/shopping_list";
		}

}
