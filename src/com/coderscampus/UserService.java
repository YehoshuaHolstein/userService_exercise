package com.coderscampus;

public class UserService {
	
	public User createUser(String[] stringInput) {	// ["me", "123", "John D"]
		User user = new User();
		user.setUsername(stringInput[0]);
		user.setPassword(stringInput[1]);
		user.setName(stringInput[2]);
		return user;
	}


}
