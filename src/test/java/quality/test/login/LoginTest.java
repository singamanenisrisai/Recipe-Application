package test.java.quality.test.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.quality.main.login.ILogin;
import main.java.quality.main.login.Login;

class LoginTest {
	
	
	private static boolean checkNull(String userName) {
		ILogin login = new Login();
		return(login.isUserNameNull(userName));
	}

	@Test
	void isUserNameNull() {
		//assertTrue(checkNull(username),"Username is Null");
		fail("Not yet implemented");
	}
	
	@Test
	void isUserNameEmpty() {
		fail("Not yet implemented");
	}
	
	@Test
	void isUserPasswordNull() {
		fail("Not yet implemented");
	}
	
	@Test
	void isUserPasswordEmpty() {
		fail("Not yet implemented");
	}
	
	@Test
	void isValidUser() {
		fail("Not yet implemented");
	}
	
	@Test
	void areValidUserCredentials() {
		fail("Not yet implemented");
	}
	

}
