package item3;

import java.util.ArrayList;
import java.util.List;

import item2.User;

public class UserRepo {

	private User user;
	public List<User> getUsers() {
		return new ArrayList<>();
	}

	public User getUser() {
		return user;
	}
}
