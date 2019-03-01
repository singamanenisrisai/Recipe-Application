package com.quality.project.businesslayer;

public class Categories implements ICategories{
	public int categoryId;
	public String categoryName;

	@Override
	public int getCategoryId() {
		return categoryId;
	}

	@Override
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;		
	}

	@Override
	public String getCategoryName() {
		return categoryName;
	}

	@Override
	public void setCategoryName(String categoryName) {
		//check for null values of the in coming categoryName
		this.categoryName = categoryName;		
	}
	
}
