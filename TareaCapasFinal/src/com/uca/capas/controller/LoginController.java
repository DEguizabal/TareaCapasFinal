package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	
	@RequestMapping("/")
	public ModelAndView initMain(Model model ) {		
		ModelAndView mav = new ModelAndView();	

		
		return mav;
	}
}