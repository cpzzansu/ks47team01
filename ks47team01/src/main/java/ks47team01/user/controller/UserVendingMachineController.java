package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserVendingMachineController {

	// 유저 자판기 메인화면
	@GetMapping("/userVendingMachine/vmMain")
	public String userVmMain() {
		
		return "user_vending_machine/vm_main";
	}
	
	// 자판기 사용 지역 선택 화면
	@GetMapping("/userVendingMachine/vmLocalSelect")
	public String userVmLocalSelect () {
		
		return "user_vending_machine/vm_local_select";
	}

	// 자판기 사용 군/구/동 선택 화면
	@GetMapping("/userVendingMachine/vmAreaSelect")
	public String userVmAreaSelect () {
		
		return "user_vending_machine/vm_area_select";
	}
	
	// 선택한 허브 내 자판기 선택 화면
	@GetMapping("/userVendingMachine/vmMachineSelect")
	public String userVmMachineSelect () {
		
		return "user_vending_machine/vm_machine_select";
	}
	
	// 자판기 판매공간 선택 화면
	@GetMapping("/userVendingMachine/vmSpaceSelect")
	public String userVmSpaceSelect () {
		
		return "user_vending_machine/vm_space_select";
	}
	
	// 자판기 판매공간 선택 및 결제
	@GetMapping("/userVendingMachine/vmSpacePayment")
	public String userVmSpacePayment () {
		
		return "user_vending_machine/vm_space_payment";
	}
	
	// 자판기 판매공간 선택 예약 확인 화면
	@GetMapping("/userVendingMachine/vmSpaceCheck")
	public String userVmSpaceCheck () {
		
		return "user_vending_machine/vm_space_user_check";
	}
	
	// 자판기 판매공간 선택 예약 확인 화면(리스트)
	@GetMapping("/userVendingMachine/vmSpaceCheckList")
	public String userVmSpaceCheckList () {
		
		return "user_vending_machine/vm_space_user_check_list";
	}
	
	
	
}
