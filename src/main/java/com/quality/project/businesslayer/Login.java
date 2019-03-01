package com.quality.project.businesslayer;

public class Login implements ILogin{

	@Override
	public boolean isUserNameNull(String userName) {
		return (null==userName);
	}

}
