package ks47team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks47team01.common.dto.HubLargeCate;
import ks47team01.common.dto.HubMidCateFinal;
import ks47team01.common.dto.VendingMachine;
import ks47team01.user.service.UserVmService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class UserVendingMachineController {
	
	private final UserVmService userVmService;

	// 유저 자판기 메인화면
	@GetMapping("/userVendingMachine/vmMain")
	public String userVmMain(Model model) {
		model.addAttribute("title", "자판기");
		return "user_vending_machine/vm_main";
	}
	
	// 자판기 사용 지역 선택 화면
	@GetMapping("/userVendingMachine/vmLocalSelect")
	public String userVmLocalSelect (Model model) {
		
		List<HubLargeCate> getHubList = userVmService.getHubList();
		
		model.addAttribute("title", "지역 선택");
		model.addAttribute("getHubList", getHubList);
		
		return "user_vending_machine/vm_local_select";
	}

	// 자판기 사용 군/구/동 선택 화면
	@GetMapping("/userVendingMachine/vmAreaSelect")
	public String userVmAreaSelect (Model model,
									@RequestParam(value = "hubLargeCateCode")String hubLargeCateCode) {
		List<HubMidCateFinal> getAreaList = userVmService.getAreaList(hubLargeCateCode);
		model.addAttribute("title", "동네 선택");
		model.addAttribute("getAreaList", getAreaList);
		return "user_vending_machine/vm_area_select";
	}
	
	// 선택한 허브 내 자판기 선택 화면
	@GetMapping("/userVendingMachine/vmMachineSelect")
	public String userVmMachineSelect (Model model,
									@RequestParam(value = "hubMidCateFinalCode")String hubMidCateFinalCode) {
		List<VendingMachine> getVmList = userVmService.getVmList(hubMidCateFinalCode); 
		model.addAttribute("title", "자판기 선택");
		model.addAttribute("getVmList", getVmList);
		return "user_vending_machine/vm_machine_select";
	}
	
	// 자판기 판매공간 선택 화면
	@GetMapping("/userVendingMachine/vmSpaceSelect")
	public String userVmSpaceSelect (Model model) {
		model.addAttribute("title", "판매 공간 선택");
		return "user_vending_machine/vm_space_select";
	}
	
	// 자판기 판매공간 선택 및 결제
	@GetMapping("/userVendingMachine/vmSpacePayment")
	public String userVmSpacePayment (Model model) {
		model.addAttribute("title", "결제하기");
		return "user_vending_machine/vm_space_payment";
	}
	
	// 자판기 결제 확인 및 예약 확인 화면
	@GetMapping("/userVendingMachine/vmSpaceCheck")
	public String userVmSpaceCheck (Model model) {
		model.addAttribute("title", "결제 정보 확인");
		return "user_vending_machine/vm_space_user_check";
	}
	
	// 자판기 판매공간 선택 예약 확인 화면(리스트)
	@GetMapping("/userVendingMachine/vmSpaceCheckList")
	public String userVmSpaceCheckList (Model model) {
		
		model.addAttribute("title", "전체 예약 확인");
		
		return "user_vending_machine/vm_space_user_check_list";
	}
	
	// 자판기 예약 상세 확인 화면
	@GetMapping("/userVendingMachine/vmSpaceDetail")
	public String userVmSpaceDetail (Model model) {
		
		model.addAttribute("title", "예약 상세 확인");
		
		return "user_vending_machine/vm_space_user_detail";
	}
	
	// 자판기 예약 결제 실패 화면
	@GetMapping("/userVendingMachine/vmPaymentFail")
	public String userVmPaymentFail (Model model) {
		
	
		return "user_vending_machine/vm_payment_fail.html";
	}
	
	
}
