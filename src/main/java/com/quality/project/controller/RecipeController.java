package com.quality.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	
	@RequestMapping("/search")
	public String search() {
		return "Hello";
	}

}
