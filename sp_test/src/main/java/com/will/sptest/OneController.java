package com.will.sptest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OneController {

	private static final Logger logger 
	= LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/one", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("one");
		
		model.addAttribute("result", "one");
		
		return "one";
	}

}
