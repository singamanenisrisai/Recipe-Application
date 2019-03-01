package com.quality.project.businesslayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SearchController {
	
	@Autowired
	Search sampleResults;
	
	@RequestMapping("/sample")
	public String sample() {
		return "In Sample";
	}
	
	@RequestMapping("/searchfield")
	public List<String> getAllUserName() {
		return sampleResults.getAllResults();
	}
	
	@RequestMapping("/home")
	public ModelAndView helloWorld() {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("home");
	    mav.addObject("message", sampleResults.getAllResults());
	    return mav;
	}
}
