package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("AdminPlanController")
@RequestMapping("/adminPlan")
public class PlanController {

	/**
	 * 계획 작물 관리 메인화면
	 */
	@GetMapping("/cropsMain")
	public String cropsMain() {
		
		return "admin_plan/crops_main";
	}
	
	/**
	 * 계획 작물 등록화면
	 */
	@GetMapping("/addCrops")
	public String addCrops() {
		
		return "admin_plan/add_crops";
	}
	
	/**
	 * 계획 작물 수정화면
	 */
	@GetMapping("/modifyCrops")
	public String modifyCrops() {
		
		return "admin_plan/modify_crops";
	}
	
	/**
	 * 계획 작물 삭제화면
	 */
	@GetMapping("/removeCrops")
	public String removeCrops() {
		
		return "admin_plan/remove_crops";
	}
	
	

	/**
	 * 계획 키트 관리 메인화면
	 */
	@GetMapping("/kitMain")
	public String kitMain() {
		
		return "admin_plan/kit_main";
	}
	
	/**
	 * 계획 키트 등록화면
	 */
	@GetMapping("/addKit")
	public String addKit() {
		
		return "admin_plan/add_kit";
	}
	
	/**
	 * 계획 키트 수정화면
	 */
	@GetMapping("/modifyKit")
	public String modifyKit() {
		
		return "admin_plan/modify_kit";
	}
	
	/**
	 * 계획 키트 삭제화면
	 */
	@GetMapping("/removeKit")
	public String removeKit() {
		
		return "admin_plan/remove_kit";
	}
	
	
	
	/**
	 * 농사 계획 관리 메인화면
	 */
	@GetMapping("/planMain")
	public String planMain() {
		
		return "admin_plan/plan_main";
	}
	
	/**
	 * 농사 계획 등록화면
	 */
	@GetMapping("/addPlan")
	public String addPlan() {
		
		return "admin_plan/add_plan";
	}
	
	/**
	 * 농사 계획 수정화면
	 */
	@GetMapping("/modifyPlan")
	public String modifyPlan() {
		
		return "admin_plan/modify_plan";
	}
	
	/**
	 * 농사 계획 삭제화면
	 */
	@GetMapping("/removePlan")
	public String removePlan() {
		
		return "admin_plan/remove_plan";
	}
	
	
	

	/**
	 * 농사 계획 실행 메인화면
	 */
	@GetMapping("/planActionMain")
	public String planActionMain() {
		
		return "admin_plan/plan_action_main";
	}
	
	/**
	 * 농사 계획 실행 수정화면
	 */
	@GetMapping("/modifyPlanAction")
	public String modifyPlanAction() {
		
		return "admin_plan/modify_plan_action";
	}
	
	/**
	 * 농사 계획 실행 삭제화면
	 */
	@GetMapping("/removePlanAction")
	public String removePlanAction() {
		
		return "admin_plan/remove_plan_action";
	}
	
}








