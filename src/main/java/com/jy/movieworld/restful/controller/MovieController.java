package com.jy.movieworld.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
	@GetMapping("/main")
	public String hello() {
		System.out.println("실행!");
		
		return "main";
	}
}
