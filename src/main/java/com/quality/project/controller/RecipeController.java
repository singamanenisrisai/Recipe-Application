package com.quality.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.quality.project.search.Search;

@RestController
public class RecipeController {
	
	@Autowired
	Search sampleResults;
	
	@RequestMapping("/navneet")
	public String search() {
		return "Hello";
	}
	
	@RequestMapping("/search")
	public List<String> getAllUserName() {
		return sampleResults.getAllResults();
	}

	
//	@GetMapping(value = "/home")
//	public String home(ModelMap model) {		
//		String message ="Navneet Singh";
//		model.addAttribute("message",message);
//		return "home";
////		return new ModelAndView("home","message",message);
//	}
	
	@GetMapping(value = "/home")
	public ModelAndView helloWorld() {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("home");
	    mav.addObject("message", "Hello World!");
	    return mav;
	}

}
