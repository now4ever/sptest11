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
public class TwoController {
	private static final Logger logger 
	= LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/two", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		model.addAttribute("time", date.toLocaleString() );
		
		return "two";
	}
}
