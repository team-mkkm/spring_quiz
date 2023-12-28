package jp.co.mkkm.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {
	
// ------------------------------------------------
	
	@RequestMapping(path = "/quiz")
	public String quiz() {
		return "quiz/index";
	}
	
}
