package jp.co.mkkm.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

	@RequestMapping(path = "/bug")
	public String error() {
		return "error/error404";
	}

}
