package services;

import java.util.List;

import controllers.UserController;
import models.User;

public class UserService {
	
	private UserController userController;
	
	public UserService(UserController userController) {
		this.userController = userController;
	}
	
	public User registerUser(String fullName, String email, String password, String area) {
		//do some null checks 
		if(isEmailUnique(email)) {
			return userController.registerUser(fullName, email, password, area);
		}
		else {
			//maybe try exception instead of this
			System.out.println("Registration failed: Email already in use");
			return null;
		}
	}
	
	private boolean isEmailUnique(String email) {
		for(User user: userController.getAllUsers()) {
			if(user.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean authenticateUser(String email, String password) {
		return userController.authenticateUser(email, password);
	}

	public User getUserByEmail(String email) {
		return userController.getUserByEmail(email);
	}
	
	public List<User> getAllUsers(){
		return userController.getAllUsers();
	}
	
}
