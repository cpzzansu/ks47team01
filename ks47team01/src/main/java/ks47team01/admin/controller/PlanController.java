package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("AdminPlanController")
@RequestMapping("/adminPlan")
public class PlanController {

	@GetMapping("/cropsMain")
	public String cropsMain() {
		
		return "admin_plan/crops_main";
	}
	
	@GetMapping("/addCrops")
	public String addCrops() {
		
		return "admin_plan/add_crops";
	}
	
	@GetMapping("/modifyCrops")
	public String modifyCrops() {
		
		return "admin_plan/modify_crops";
	}
	
	@GetMapping("/removeCrops")
	public String removeCrops() {
		
		return "admin_plan/remove_crops";
	}
	
	

	
	@GetMapping("/kitMain")
	public String kitMain() {
		
		return "admin_plan/kit_main";
	}
	
	@GetMapping("/addKit")
	public String addKit() {
		
		return "admin_plan/add_kit";
	}
	
	@GetMapping("/modifyKit")
	public String modifyKit() {
		
		return "admin_plan/modify_kit";
	}
	
	@GetMapping("/removeKit")
	public String removeKit() {
		
		return "admin_plan/remove_kit";
	}
	
	
	
	
	
	@GetMapping("/planMain")
	public String planMain() {
		
		return "admin_plan/plan_main";
	}
	
	@GetMapping("/addPlan")
	public String addPlan() {
		
		return "admin_plan/add_plan";
	}
	
	@GetMapping("/modifyPlan")
	public String modifyPlan() {
		
		return "admin_plan/modify_plan";
	}
	
	@GetMapping("/removePlan")
	public String removePlan() {
		
		return "admin_plan/remove_plan";
	}
	
	
	

	
	@GetMapping("/planActionMain")
	public String planActionMain() {
		
		return "admin_plan/plan_action_main";
	}
	
	@GetMapping("/modifyPlanAction")
	public String modifyPlanAction() {
		
		return "admin_plan/modify_plan_action";
	}
	
	@GetMapping("/removePlanAction")
	public String removePlanAction() {
		
		return "admin_plan/remove_plan_action";
	}
	
}








