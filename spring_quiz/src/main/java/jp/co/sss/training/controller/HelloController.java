package jp.co.sss.training.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller
public class HelloController {
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_01/hello")
	public String hello() {
		return "lesson01/hello";
	}
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_02/before")
	public String before() {
		return "lesson01/before";
	}
	
	@RequestMapping(path = "/lesson01_02/after")
	public String after() {
		return "lesson01/after";
	}

	@RequestMapping(path = "/lesson01_02/forward")
	public String forward01_02() {
		return "forward:/lesson01_02/after";
	}
	
//	@RequestMapping(path = "/lesson01_02/redirect")
//	public String redirect01_02() {
//		return "redirect:/lesson01_02/after";
//	}	

// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_03/before")
	public String before01_03() {
		return "lesson01/before";
	}
	
	@RequestMapping(path = "/lesson01_03/after")
	public String after01_03() {
		return "lesson01/after";
	}
	
//	@RequestMapping(path = "/lesson01_03/forward")
//	public String forward01_03() {
//		return "forward:/lesson01_03/after";
//	}
	
	@RequestMapping(path = "/lesson01_03/redirect")
	public String redirect01_03() {
		return "redirect:/lesson01_03/after";
	}	
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_04/hello")
	public String hello01_04() {
		return "redirect:/lesson01_04/world";
	}		
	
	@RequestMapping(path = "/lesson01_04/world")
	public String world() {
		return "lesson01/world";
	}
	
// ------------------------------------------------

	@RequestMapping(path = "/lesson01_05/getForm")
	public String getForm() {
		return "lesson01/input";
	}	
	
	@RequestMapping(path = "/lesson01_05/submitForm", method = RequestMethod.GET)
	public String submitForm(String param) {
		System.out.println(param);
		return "lesson01/input";
	}	
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_06/postForm")
	public String postForm() {
		return "lesson01/input2";
	}	
	
	@RequestMapping(path = "/lesson01_06/submitForm", method = RequestMethod.POST)
	public String submit2Form(String pass) {
		System.out.println(pass);
		return "lesson01/input2";
	}	
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_07/login")
	public String login() {
		return "lesson01/login";
	}	
	
	@RequestMapping(path = "/lesson01_07/logincheck", method = RequestMethod.POST)
	public String loginCheck(String userId, String password) {
		if (userId == null || userId.equals("")) {
			return "lesson01/login";
		} else if (userId.equals(password)) {
			return "lesson01/success"; 
		} else {
			return "lesson01/login";
		}
	}
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_08/login")
	public String login08() {
		return "lesson01/login08";
	}	
	
	@RequestMapping(path = "/lesson01_08/logincheck", method = RequestMethod.POST)
	public String loginCheck08(LoginForm loginForm) {
		if (loginForm.getUserId() == null || loginForm.getUserId().equals("")) {
			return "lesson01/login08";
		} else if (loginForm.getUserId().equals(loginForm.getPassword())) {
			return "lesson01/success08"; 
		} else {
			return "lesson01/login08";
		}
	}
	
// ------------------------------------------------
	
	@RequestMapping(path = "/lesson01_09/login")
	public String login09() {
		return "lesson01/login09";
	}	
	
	@RequestMapping(path = "/lesson01_09/logincheck", method = RequestMethod.POST)
	public String loginCheck09(LoginForm loginForm, HttpSession httpSession) {
		if (loginForm.getUserId() == null || loginForm.getUserId().equals("")) {
			return "lesson01/login09";
		} else if (loginForm.getUserId().equals(loginForm.getPassword())) {
			httpSession.setAttribute("userId",loginForm.getUserId());
			return "lesson01/success09"; 
		} else {
			return "lesson01/login09";
		}
	}
	
}
