package com.laivanon.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController2 {
	@RequestMapping("/boot")
	public ModelAndView showMVC() {
		ModelAndView mv = new ModelAndView("view_boot");
		return mv;
	}
}
