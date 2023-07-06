package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminVendingMachineController {

	// 관리자 자판기 메인
	@GetMapping("/adminVendingMachine/vmMain")
	public String adminVmMain(Model model) {
		model.addAttribute("title","자판기 관리 메인");
		return "admin_vending_machine/main_vm";
	}
	
	// 자판기 등록 화면
	@GetMapping("/adminVendingMachine/vmAdd")
	public String adminVmAdd(Model model) {
		model.addAttribute("title","자판기 등록");
		return "admin_vending_machine/add_vm";
	}
	
	// 자판기 수정 화면
	@GetMapping("/adminVendingMachine/vmModify")
	public String adminVmModify(Model model) {
		model.addAttribute("title","자판기 수정");
		return "admin_vending_machine/modify_vm";
	}
	// 자판기 삭제 화면
	@GetMapping("/adminVendingMachine/vmRemove")
	public String adminVmDelete(Model model) {
		model.addAttribute("title","자판기 삭제");
		return "admin_vending_machine/remove_vm";
	}
	// 자판기 사용 메인
	@GetMapping("/adminVendingMachine/vmHubMain")
	public String adminVmHubMain(Model model) {
		model.addAttribute("title","자판기 사용 메인");
		return "admin_vending_machine/admin_hub_vm_main";
	}
	// 자판기 사용 등록
	@GetMapping("/adminVendingMachine/vmAddHub")
	public String adminVmAddHub(Model model) {
		model.addAttribute("title","자판기 사용 등록");
		return "admin_vending_machine/add_hub_vm";
	}
	// 자판기 사용 수정
	@GetMapping("/adminVendingMachine/vmModifyHub")
	public String adminVmModifyHub(Model model) {
		model.addAttribute("title","자판기 사용 수정");
		return "admin_vending_machine/modify_hub_vm";
	}
	// 자판기 사용 삭제
	@GetMapping("/adminVendingMachine/vmRemoveHub")
	public String adminVmRemoveHub(Model model) {
		model.addAttribute("title","자판기 사용 삭제");
		return "admin_vending_machine/remove_hub_vm";
	}
}
