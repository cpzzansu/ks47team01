package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserPlanController")
@RequestMapping("/userPlan")
public class PlanController {
	
	
	@GetMapping("/planMain")
	public String planMain(){
		
		return "user_plan/plan_main";
	}
	
	
	
	@GetMapping("/addCrops")
	public String addCrops(){
		
		return "user_plan/add_crops";
	}
	
	@GetMapping("/removeCrops")
	public String removeCrops(){
		
		return "user_plan/remove_crops";
	}
	
	
	@GetMapping("/addKit")
	public String addKit(){
		
		return "user_plan/add_kit";
	}
	
	@GetMapping("/addPlan")
	public String addPlan(){
		
		return "user_plan/add_plan";
	}
	
	@GetMapping("/cropsPlan")
	public String cropsPlan(){
		
		return "user_plan/crops_plan";
	}
	
	@GetMapping("/modifyKit")
	public String modifyKit(){
		
		return "user_plan/modify_kit";
	}
	
	@GetMapping("/modifyPlan")
	public String modifyPlan(){
		
		return "user_plan/modify_plan";
	}

}
