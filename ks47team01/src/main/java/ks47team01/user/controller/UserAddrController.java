package ks47team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks47team01.common.dto.AddressDeliveryRequest;
import ks47team01.common.dto.UrbanfarmerAddress;
import ks47team01.user.service.UrbanfarmerAddressService;
import ks47team01.user.service.UrbanfarmerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@AllArgsConstructor
@Slf4j
public class UserAddrController {
	
	private final UrbanfarmerAddressService urbanfarmerAddressService;
	
	/** 배송지 목록 화면								
	 * 
	 * @return
	 */
	@GetMapping("/user/userAddrList")
	public String userAddrList(Model model) {
		
		model.addAttribute("title", "배송지 목록");
		
		return "user_addr/addr_user_list";
		
	}
	/** 배송지 등록 화면								                             				
	 * 
	 * @return 
	 */
	@GetMapping("/user/addUserAddr")
	public String addUserAddr(Model model) {
		
		List<AddressDeliveryRequest> addressDeliveryRequestList = urbanfarmerAddressService.getAddressDeliveryRequestList();
		
		log.info("addressDeliveryRequestList : {}", addressDeliveryRequestList);
		
		model.addAttribute("title", "배송지 등록");
		model.addAttribute("addressDeliveryRequestList", addressDeliveryRequestList);
		
		
		return "user_addr/add_user_addr";
		
	}
	
	@PostMapping("/user/addUserAddr")
	public String addAddr(UrbanfarmerAddress urbanfarmerAddress) {
		
		UrbanfarmerAddress addAddress = urbanfarmerAddressService.addUrbanfarmerAddress(urbanfarmerAddress);
		
		return "redirect:/user/userAddrList";
		
	}
	
	/** 배송지 삭제								 								
	 * 
	 * @return
	 */
	@GetMapping("/user/removeUserAddr")
	public String removeUserAddr(Model model) {
		
		model.addAttribute("title", "배송지 삭제");
		
		return "user_addr/remove_user_addr";
		
	}
	/** 배송지 수정 
	 * 
	 * @return
	 */
	@GetMapping("/user/updateUserAddr")
	public String updateUserAddr(Model model) {
		
		model.addAttribute("title", "배송지 수정");
		
		return "user_addr/update_user_addr";
		
	}
	
	
}
