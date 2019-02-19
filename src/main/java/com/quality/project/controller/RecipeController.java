package com.quality.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quality.project.search.Search;

@RestController
public class RecipeController {
	
	@Autowired
	Search sampleResults;
	
	@RequestMapping("/search")
	public String search() {
		return "Hello";
	}
	
	@RequestMapping("/check")
	public List<String> getAllUserName() {
		return sampleResults.getAllResults();
	}

}
