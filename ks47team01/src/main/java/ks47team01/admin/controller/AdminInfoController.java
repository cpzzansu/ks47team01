package ks47team01.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks47team01.admin.service.UrbanfarmAdminService;
import ks47team01.common.dto.GoodsKit;
import ks47team01.common.dto.Urbanfarmer;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AdminInfoController {
	
	private final UrbanfarmAdminService urbanfarmAdminService;
	
	/** 회원 조회	화면
	 * 
	 * @return 
	 */
	@GetMapping("adminInfo/adminSearchUser")
	public String adminSearchUser(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/search_user_admin";
	}
	
    @ResponseBody
    @GetMapping("adminInfo/adminInfoManageData")
    public List<Urbanfarmer> adminInfodata() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<Urbanfarmer> urbanfarmerList = urbanfarmAdminService.getUrbanfarmerInfoList(paramMap);

        paramMap.put("data", urbanfarmerList);

        return urbanfarmerList;
    }
	
	/** 회원 삭제(관리자)								
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/adminRemoveUsers")
	public String adminRemoveUser(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/remove_user_admin";
	}
	/** 직원 정보 수정								
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/adminUpdateInfo")
	public String adminUpdateInfo(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/update_admin_info";
	}
	/** 허브직원 정보 수정								
	 * 
	 * @return 
	 */
	@GetMapping("/adminInfo/hubcrewUpdateInfo")
	public String hubcrewUpdateInfo(Model model) {
		
		model.addAttribute("title", "urbanfarm");
		
		return "admin_info/update_hubcrew_info";
	}
	
    @PostMapping("adminInfo/adminInfoUpdate")
    @ResponseBody
    public Urbanfarmer adminInfoUpdate(@RequestParam("checkedData") String checkedData){
        String finalCheckedData = checkedData;

        System.out.println(finalCheckedData);

        Urbanfarmer urbanfarmerInfo = urbanfarmAdminService.getUrbanfarmerData(finalCheckedData);

        System.out.println(urbanfarmerInfo);

        return urbanfarmerInfo;
    }
				
}
