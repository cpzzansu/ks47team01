package ks47team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("userOrderController")
public class OrderController {
	
	/**
	 * 취소/교환/반품신청 시 사용자가 전송한 POST값 수령
	 * @param requestType
	 * @param requestReason
	 * @param fileName
	 * @return
	 */
	@PostMapping("/userOrder/userOrderProcessing")
	public String user_order_processing_obj(@RequestParam(value = "requestType") String requestType, 
            @RequestParam(value = "requestReason") String requestReason,
            @RequestParam(value = "fileName") MultipartFile fileName){
		System.out.println(requestType);
		System.out.println(requestReason);
		System.out.println(fileName);
		return "user_order/order_processing.html";
	}
	
	/**
	 * order_main.html에서 취소, 반품, 교환 버튼 클릭시 ajax로 post 받음
	 * @param model
	 * @param innerText
	 * @return
	 */
	@PostMapping("/userOrder/userOrderProcessingText")
	@ResponseBody
	public String user_order_processing_btn(Model model, @RequestBody String innerText) {
		
		if(innerText.equals("주문취소")) {
			innerText= "주문취소";
		}else if(innerText.equals("반품신청")) {
			innerText= "반품";
		}else if(innerText.equals("교환신청")) {
			innerText= "교환";
		}

		return innerText;
	}
	
	/**
	 * 취소/교환/반품신청 맵핑
	 * @param model
	 * @return
	 */
	@GetMapping("/userOrder/userOrderProcessing")
	public String user_order_processing(Model model, @RequestParam(value = "innerText") String innerText ) {
		model.addAttribute("title", "urbanfarm");
		model.addAttribute("innerText", innerText);
		return "user_order/order_processing.html";
	}
	
	/**
	 * 상세주문내역 매핑
	 * @param model
	 * @return
	 */
	@GetMapping("/userOrder/userOrderDetail")
	public String user_order_detail(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_order/order_detail.html";
	}
	
	/**
	 * 주문내역 맵핑
	 * @param model
	 * @return
	 */
	@GetMapping("/userOrder/userOrderList")
	public String user_order_list(Model model) {
		model.addAttribute("title", "urbanfarm");
		return "user_order/order_main.html";
	}
}
