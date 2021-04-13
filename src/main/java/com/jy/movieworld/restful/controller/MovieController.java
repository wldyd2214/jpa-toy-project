package com.jy.movieworld.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController //RestController를 사용하면 반확 객체 사용시 @ResponseBody를 생략하여 사용해도 된다.
public class MovieController {
	//@RequestMapping("/main", method=@RequestMethod.GET)
	//@GetMapping(value="/main")
	@GetMapping("/main")
	public String movieMain() {
		return "main";
	}
	
	@ResponseBody
	@RequestMapping("/valueTest")
	public String valueTest() {
		String value = "메인 컨트롤러 테스트";
		return value;
	}
}
