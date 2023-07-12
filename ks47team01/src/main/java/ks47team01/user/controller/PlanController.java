package ks47team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.CropsName;
import ks47team01.common.dto.FarmingPlan;
import ks47team01.user.service.CropsService;
import ks47team01.user.service.FarmingPlanService;
import lombok.AllArgsConstructor;

@Controller("UserPlanController")
@RequestMapping("/userPlan")
@AllArgsConstructor
public class PlanController {
	
	private final FarmingPlanService farmingPlanService;
	private final CropsService cropsService;
	/**
	 * 작물 계획 메인화면
	 */
	@GetMapping("/planMain")
	public String planMain(Model model, HttpSession session){
		session.setAttribute("SID", "id003");
		String userId = (String)session.getAttribute("SID");
		List<FarmingPlan> farmingPlanList = farmingPlanService.getFarmingPlanListById(userId);
		
		model.addAttribute("title", "농사 계획");
		model.addAttribute("farmingPlanList",farmingPlanList);
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
	public String addCrops(Model model){
		//작물 이름, 코드 가져오기
		List<CropsName> cropsNameList = cropsService.getCropsNameList();
		model.addAttribute("title", "작물등록");
		model.addAttribute("cropsNameList", cropsNameList);
		return "user_plan/add_crops";
	}
	
	/**
	 * 작물 등록처리
	 * 처리 후 농사 계획 메인화면으로 이동
	 */
	@PostMapping("/addCrops")
	public String addCrops() {
		
		return "redirect:/userPlan/planMain";
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
	public String cropsPlan(@RequestParam(value="farmerFarmingPlanCode")String farmerFarmingPlanCode , 
							Model model){
		model.addAttribute("title", "작물 상세보기");
		return "user_plan/crops_plan";
	}
}
