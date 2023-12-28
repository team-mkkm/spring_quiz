package jp.co.mkkm.training.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorController {
	
	@RequestMapping(path = "/error")
	public String error() {
		return "error/error404";
	}	

}
