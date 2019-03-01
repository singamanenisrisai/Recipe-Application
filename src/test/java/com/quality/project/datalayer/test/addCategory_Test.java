package com.quality.project.datalayer.test;

import org.junit.Test;

import com.quality.project.businesslayer.ICategories;
import com.quality.project.datalayer.CRUDTemplate;
import com.quality.project.datalayer.CategoryTemplate;

/*
 * Input : Category Name
 * Output: Response depending upon the input
 * 
 * Cases Covered
 * addFirstTypeOfCategory: When input category name is valid
 * addSecondTypeOfCategory: When input category is null
 * addThirdTypeOfCategory: When input category is blank
 * */

public class addCategory_Test {
	
	CRUDTemplate<ICategories> categoryTempate = new CategoryTemplate();
	@Test
	public void addFirstTypeOfCategory() {
		
	}
	
	@Test
	public void addSecondTypeOfCategory() {
		
	}
	
	@Test
	public void addThirdTypeOfCategory() {
		
	}
}
