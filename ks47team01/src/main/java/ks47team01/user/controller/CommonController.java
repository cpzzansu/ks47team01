package ks47team01.user.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ks47team01.user.service.CommonService;

@Controller("userCommonController")
public class CommonController {

		private final CommonService commonService;
		
		public CommonController(@Qualifier("userCommonService") CommonService commonService) {
			this.commonService = commonService;
		}
}
