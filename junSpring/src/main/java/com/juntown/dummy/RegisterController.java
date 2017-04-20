package com.juntown.dummy;

import java.lang.ProcessBuilder.Redirect;
import java.util.Locale;

import org.apache.tiles.request.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.RequestContextFilter;

@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@RequestMapping(value = "/register.lms", method = RequestMethod.GET)
	public String register(Locale locale, Model model){
		return "register";
	}
	
	@RequestMapping(value = "/register.lms", method = RequestMethod.POST)
	public String registerForward(Locale locale,
			@ModelAttribute("User") User user, Model model){
		if(!user.getPassword().equals(user.getConfirmPassword())){
			model.addAttribute("msg", "password not matched");
			model.addAttribute("user", user);
//			return "forward:register.lms";
//			return "redirect:register.lms";
			return "register";
		}
		
		UserDAO.save(user);
		return "redirect:registerFinished.lms";
		
	}
	
	@RequestMapping(value = "/registerFinished.lms")
	public String registerFinished(Model model){
		return "registerFinished";
	}	
	
}
