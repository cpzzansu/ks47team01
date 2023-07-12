package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminCropsCate")
public class CropsCateController {

	/**
	 * 작물별 재배계획 대분류 관리 메인화면
	 */
	@GetMapping("/largeCateMain")
	public String largeCateMain() {
		
		return "admin_crops_cate/large_cate_main";
	}
	
	/**
	 * 작물별 재배계획 대분류 등록화면
	 */
	@GetMapping("/addLargeCate")
	public String addLargeCate() {
		
		return "admin_crops_cate/add_large_cate";
	}
	/**
	 * 작물별 재배계획 대분류 수정화면
	 */
	@GetMapping("/modifyLargeCate")
	public String modifyLargeCate() {
		
		return "admin_crops_cate/modify_large_cate";
	}
	
	/**
	 * 작물별 재배계획 대분류 삭제화면
	 */
	@GetMapping("/removeLargeCate")
	public String removeLargeCate() {
		
		return "admin_crops_cate/remove_large_cate";
	}
	
	
	
	/**
	 * 작물별 재배계획 소분류 관리 메인화면
	 */
	@GetMapping("/smallCateMain")
	public String smallCateMain() {
		
		return "admin_crops_cate/small_cate_main";
	}
	
	/**
	 * 작물별 재배계획 소분류 추가화면
	 */
	@GetMapping("/addSmallCate")
	public String addSmallCate() {
		
		return "admin_crops_cate/add_small_cate";
	}
	
	/**
	 * 작물별 재배계획 소분류 수정화면
	 */
	@GetMapping("/modifySmallCate")
	public String modifySmallCate() {
		
		return "admin_crops_cate/modify_small_cate";
	}

	/**
	 * 작물별 재배계획 소분류 수정화면
	 */
	@GetMapping("/removeSmallCate")
	public String removeSmallCate() {
		
		return "admin_crops_cate/remove_small_cate";
	}
}
