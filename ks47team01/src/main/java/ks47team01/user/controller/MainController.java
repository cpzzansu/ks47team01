package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// index경로 메인화면 이동
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", "urbanfarm_index");
		return "user/main";
	}
	
	
	
	
	
	
	// 메인화면 컨트롤러
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("title", "urbanfarm_메인화면");
		return "user/main";
	}
}
