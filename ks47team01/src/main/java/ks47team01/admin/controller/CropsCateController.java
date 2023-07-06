package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminCropsCate")
public class CropsCateController {

	@GetMapping("/largeCateMain")
	public String largeCateMain() {
		
		return "admin_crops_cate/large_cate_main";
	}
	
	@GetMapping("/addLargeCate")
	public String addLargeCate() {
		
		return "admin_crops_cate/add_large_cate";
	}
	
	@GetMapping("/modifyLargeCate")
	public String modifyLargeCate() {
		
		return "admin_crops_cate/modify_large_cate";
	}
	
	@GetMapping("/removeLargeCate")
	public String removeLargeCate() {
		
		return "admin_crops_cate/remove_large_cate";
	}
	
	
	
	
	@GetMapping("/smallCateMain")
	public String smallCateMain() {
		
		return "admin_crops_cate/small_cate_main";
	}
	
	@GetMapping("/addSmallCate")
	public String addSmallCate() {
		
		return "admin_crops_cate/add_small_cate";
	}
	
	@GetMapping("/modifySmallCate")
	public String modifySmallCate() {
		
		return "admin_crops_cate/modify_small_cate";
	}

	@GetMapping("/removeSmallCate")
	public String removeSmallCate() {
		
		return "admin_crops_cate/remove_small_cate";
	}
}
