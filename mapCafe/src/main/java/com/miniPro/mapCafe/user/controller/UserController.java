package com.miniPro.mapCafe.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// restController는 view 반환 x , 뷰 반환하려면 ModelAndView로 담아서 넘겨야함
@Controller
public class UserController {

		@RequestMapping("/test")
		public String test() {
			return "test";
		}

}
