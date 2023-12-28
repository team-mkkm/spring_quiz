package jp.co.mkkm.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
// ------------------------------------------------
	
	@RequestMapping(path = "/hello")
	public String hello() {
		return "tetoris/index";
	}
	
	@RequestMapping(path = "/omikuji")
	public String omikuji() {
		return "omikuji/index";
	}

	@RequestMapping(path = "/slot")
	public String slot() {
		return "slot/index";
	}
	
	
}
