package ks47team01.user.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// index경로 메인화면 이동
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", "urbanfarm");
		model.addAttribute("isMain", true);
		return "user/main";
	}

	// 프로젝트 소개 메인 컨트롤러
	@GetMapping("/")
	public String mainPage(Model model) {


		model.addAttribute("title", "urbanfarm");
		model.addAttribute("isMain", true);

		return "main/project_main";
	}

	/**
	 * 프로젝트 소개 맵핑
	 * @return
	 */
	@GetMapping("/main/projectIntroduce")
	public String ProjectIntroduce(){
		return "main/project_introduce";
	}
}
