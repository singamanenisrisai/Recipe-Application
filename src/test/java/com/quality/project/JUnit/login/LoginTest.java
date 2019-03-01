package com.quality.project.JUnit.login;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.quality.project.businesslayer.ILogin;
import com.quality.project.businesslayer.Login;

class LoginTest {
	
	
	private static boolean checkNull(String userName) {
		ILogin login = new Login();
		return(login.isUserNameNull(userName));
	}

	/*@Test
	void isUserNameNull() {
		//assertTrue(checkNull(username),"Username is Null");
		//fail("Not yet implemented");
	}
	
	@Test
	void isUserNameEmpty() {
		//fail("Not yet implemented");
	}
	
	@Test
	void isUserPasswordNull() {
		//fail("Not yet implemented");
	}
	
	@Test
	void isUserPasswordEmpty() {
		//fail("Not yet implemented");
	}
	
	@Test
	void isValidUser() {
		//fail("Not yet implemented");
	}
	
	@Test
	void areValidUserCredentials() {
		//fail("Not yet implemented");
	}
	*/

}
