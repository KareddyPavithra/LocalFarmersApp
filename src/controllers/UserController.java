package controllers;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class UserController {

	private List<User> userList;
	
	public UserController() {
		this.userList = new ArrayList<>();
	}
	
	public User registerUser(String fullName, String email, String password, String area) {
		
		//maybe some null value checks, let's see
		User newUser = new User(fullName, email, password, area);
		userList.add(newUser);
		return newUser;
	}
	
	public boolean authenticateUser(String email, String password) {
		
		//do null checks here
		for(User user: userList) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	//get single user by email
	public User getUserByEmail(String email) {
		for(User user: userList) {
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
	//get all users
	public List<User> getAllUsers(){
		return userList;
	}
}
