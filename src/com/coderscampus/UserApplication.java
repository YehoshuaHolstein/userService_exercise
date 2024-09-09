package com.coderscampus;

public class UserApplication {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		
		User user = userService.createUser(["Joey", "hello123", "Joe Smith"]);
		//User user = userService.createUser(new String[] {"Joey", "hello123", "Joe Smith"});
				
		System.out.println("User name is : " + user.getUsername());
		System.out.println("Password is : " + user.getPassword());
		System.out.println("Name is : " + user.getName());

	}

}
