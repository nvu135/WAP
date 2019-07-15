package controller.login;

import model.User;

public class LoginService {

	public boolean isUserValid(User user) {
		if (user.getUserName().equals("admin") && user.getPassword().equals("123"))
			return true;

		return true;
	}

}
