package ks47team01.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import ks47team01.common.dto.CropsName;
import ks47team01.common.dto.FarmingPlan;
import ks47team01.common.dto.FarmingPlanLargeCate;
import ks47team01.common.dto.UrbanKit;
import ks47team01.user.service.CropsService;
import ks47team01.user.service.FarmingPlanService;
import ks47team01.user.service.UrbanKitService;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;

@Controller("UserPlanController")
@RequestMapping("/userPlan")
@AllArgsConstructor
public class PlanController {
	
	private final UrbanKitService urbanKitService;
	private final FarmingPlanService farmingPlanService;
	private final CropsService cropsService;
	private final UrbanfarmerService urbanfarmerService;
	/**
	 * 작물 계획 메인화면
	 */
	@GetMapping("/planMain")
	public String planMain(Model model, HttpSession session){
		String userId = (String)session.getAttribute("S_id");
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
	 * 농사 시작
	 */
	@GetMapping("/startPlan")
	public String startPlan(@RequestParam(value = "farmerFarmingPlanCode") String farmerFarmingPlanCode) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("farmerFarmingPlanCode", farmerFarmingPlanCode);
		farmingPlanService.startPlan(paramMap);
		
		return "redirect:/userPlan/planMain";
	}
	
	
	
	/**
	 * 키울 작물 등록화면
	 */
	@GetMapping("/addCrops")
	public String addCrops(Model model){
		//작물 이름, 코드 가져오기
		List<CropsName> cropsNameList = cropsService.getCropsNameList();
		List<UrbanKit> urbanKitList = urbanKitService.getUrbanKitList();
		model.addAttribute("title", "작물등록");
		model.addAttribute("cropsNameList", cropsNameList);
		model.addAttribute("urbanKitList", urbanKitList);
		return "user_plan/add_crops";
	}
	
	
	/**
	 * ajax, 코드별 키트정보
	 * @param urbanKitCode
	 * @return
	 */
	@PostMapping("/ajax/getKitByCode")
	@ResponseBody
	public List<UrbanKit> getKitByCode(@RequestParam(value = "cropsNameCode") String cropsNameCode){
		List<UrbanKit> kitList = urbanKitService.getUrbanKitListByCode(cropsNameCode);
		return kitList;
	}
	
	/**
	 * 작물 등록처리
	 * 처리 후 농사 계획 메인화면으로 이동
	 */
	@PostMapping("/addCrops")
	public String addCrops(@RequestParam(value = "cropsNameCode")String cropsNameCode,
							@RequestParam(value = "urbanKitCode", required = false)String urbanKitCode,
							@RequestParam(value = "farmerFarmingPlanNickname", required = false)String farmerFarmingPlanNickname,
							Model model, HttpSession session) {
		farmingPlanService.addCrops(cropsNameCode, urbanKitCode, farmerFarmingPlanNickname, session);
		return "redirect:/userPlan/planMain";
	}
	
	/**
	 * 작물 한개 정보
	 * @param farmerFarmingPlanCode
	 * @return 
	 */
	@PostMapping("/ajax/getCropsInfo")
	@ResponseBody
	public Map getCropsInfo(@RequestBody Map<String, Object> farmerFarmingPlanCode) {
		System.out.println("ddd"+farmerFarmingPlanCode);
		Map<String, Object> cropsInfoMap = farmingPlanService.getCropsInfo(farmerFarmingPlanCode);
		return cropsInfoMap;
	}
	
	/**
	 * 키울 작물 삭제화면
	 */
	@GetMapping("/removeCrops")
	public String removeCrops(@RequestParam(value = "farmerFarmingPlanCode")String farmerFarmingPlanCode,
							  @RequestParam(value = "msg", required = false) String msg,
							  Model model){
		model.addAttribute("farmerFarmingPlanCode", farmerFarmingPlanCode);
		model.addAttribute("msg", msg);
		return "user_plan/remove_crops";
	}
	
	/**
	 * 작물 삭제처리
	 */
	@PostMapping("/removeCrops")
	public String removeCrops(@RequestParam(value = "urbanfarmerId")String urbanfarmerId,
							  @RequestParam(value = "urbanfarmerPw")String urbanfarmerPw,
							  @RequestParam(value = "farmerFarmingPlanCode")String farmerFarmingPlanCode,
							  RedirectAttributes reAttr) {
		
		Map<String, Object> infoCheck = urbanfarmerService.isValidUser(urbanfarmerId, urbanfarmerPw);
		boolean isValid = (boolean)infoCheck.get("isValid");
		
		if(isValid) {
			//삭제처리 후 redirect
			farmingPlanService.deleteFarmerFarmingPlanByPlanCode(farmerFarmingPlanCode);
			return "redirect:/userPlan/planMain";
		}
		
		//아이디 불일치 시 다시
		String msg = "입력을확인해주세요"; 
		reAttr.addAttribute("farmerFarmingPlanCode", farmerFarmingPlanCode);
		reAttr.addAttribute("msg", msg);
		return "redirect:/userPlan/removeCrops";
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
		FarmingPlan farmingPlan = farmingPlanService.getFarmingPlanByCode(farmerFarmingPlanCode);
		List<FarmingPlanLargeCate> farmingPlanLargeCateList = farmingPlanService.getFarmingLargeCateByCode(farmerFarmingPlanCode);
		
		System.out.println(farmingPlanLargeCateList+"테스트");
		model.addAttribute("title", "작물 상세보기");
		model.addAttribute("farmingPlan", farmingPlan);
		model.addAttribute("farmingPlanLargeCateList", farmingPlanLargeCateList);
		return "user_plan/crops_plan";
	}
}
