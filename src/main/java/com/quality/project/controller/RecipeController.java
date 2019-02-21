package com.quality.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
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
	
//	@RequestMapping("/search")
//	public String search() {
//		return "Hello";
//	}
	
	@RequestMapping("/search")
	public List<String> getAllUserName() {
		return sampleResults.getAllResults();
	}

	
	@RequestMapping(value = "/home",method=RequestMethod.GET)
	public ModelAndView getHomePage(ModelMap model) {
		System.out.println("Inside Controller");
		String message ="Navneet Singh";
		model.addAttribute("message",message);
		return new ModelAndView("home");
//		return new ModelAndView("home","message",message);
	}

}
