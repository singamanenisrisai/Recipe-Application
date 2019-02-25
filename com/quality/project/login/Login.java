package com.quality.project.login;

public class Login implements ILogin{

	@Override
	public boolean isUserNameNull(String userName) {
		return (null==userName);
	}

}
