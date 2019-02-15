package main.java.quality.main.login;

public class Login implements ILogin{

	@Override
	public boolean isUserNameNull(String userName) {
		return (null==userName);
	}

}
