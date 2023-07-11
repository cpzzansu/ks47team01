package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserPlanController")
@RequestMapping("/userPlan")
public class PlanController {
	
	/**
	 * 작물 계획 메인화면
	 */
	@GetMapping("/planMain")
	public String planMain(){
		
		return "user_plan/plan_main";
	}
	
	/**
	 * 작물 계획 추가화면
	 */
	@GetMapping("/addPlan")
	public String addPlan(){
		
		return "user_plan/add_plan";
	}
	
	/**
	 * 작물 게획 수정화면
	 */
	@GetMapping("/modifyPlan")
	public String modifyPlan(){
		
		return "user_plan/modify_plan";
	}
	
	/**
	 * 작물 게획 삭제화면
	 */
	@GetMapping("/removePlan")
	public String removePlan() {
		
		return "user_plan/remove_plan";
	}
	
	/**
	 * 키울 작물 등록화면
	 */
	@GetMapping("/addCrops")
	public String addCrops(){
		
		return "user_plan/add_crops";
	}
	
	/**
	 * 키울 작물 삭제화면
	 */
	@GetMapping("/removeCrops")
	public String removeCrops(){
		
		return "user_plan/remove_crops";
	}
	
	
	/**
	 * 작물에 키트 추가화면
	 */
	@GetMapping("/addKit")
	public String addKit(){
		
		return "user_plan/add_kit";
	}
	
	
	/**
	 * 작물에 키트 수정화면
	 */
	@GetMapping("/modifyKit")
	public String modifyKit(){
		
		return "user_plan/modify_kit";
	}
	
	/**
	 * 작물에 키트 삭제화면
	 */
	@GetMapping("/removeKit")
	public String removeKit(){
		
		return "user_plan/remove_kit";
	}
	
	/**
	 * 작물 계획 열람화면
	 */
	@GetMapping("/cropsPlan")
	public String cropsPlan(){
		
		return "user_plan/crops_plan";
	}
}
