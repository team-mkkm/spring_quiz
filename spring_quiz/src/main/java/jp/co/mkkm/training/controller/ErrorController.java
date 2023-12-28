package jp.co.mkkm.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
<<<<<<< HEAD

	@RequestMapping(path = "/")
=======
	
	@RequestMapping(path = "/bug")
>>>>>>> bbc3150796c0e56fe88f17ee744293c7a245e620
	public String error() {
		return "error/error404";
	}

}
