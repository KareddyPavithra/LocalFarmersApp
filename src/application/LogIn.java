//package application;
//
//import java.util.ArrayList;
//import java.util.List;
//import models.User;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//
//public class LogIn {
//
//	//private List<User> userList;
//	private final String LOGIN_FILE = "Login.json";
//	
//	public LogIn() {
//		//this.userList = loadUserData();
//	}
//	
//	
//	//private List<User> loadUserData(){
//		
//		//List<User> users = new ArrayList<>();
//		
//		//JSONParser jsonParser = new JSONParser();
//		
//		try(FileReader reader = new FileReader(LOGIN_FILE)){
//			//Object obj = jsonParser.parse(reader);
//			
//			JSONArray userArray = (JSONArray) obj;
//			
//			for(Object userObj : userArray) {
//				JSONObject jsonUser = (JSONObject) userObj;
//				//User user = new User(
//						(String) jsonUser.get("fullName"),
//						(String) jsonUser.get("email"),
//						(String) jsonUser.get("password"),
//						(String) jsonUser.get("area")
//					);
//				users.add(user);
//			}
//		} catch(IOException | ParseException e) {
//			e.printStackTrace();
//		}
//		
//		return users;
//		
//	}
//	
//	private void saveUserData() {
//		
//		JSONArray jsonArray = new JSONArray();
//
//        for (User user : userList) {
//            JSONObject jsonUser = new JSONObject();
//            jsonUser.put("fullName", user.getFullName());
//            jsonUser.put("email", user.getEmail());
//            jsonUser.put("password", user.getPassword());
//            jsonUser.put("area", user.getArea());
//            jsonArray.add(jsonUser);
//        }
//
//        try (FileWriter writer = new FileWriter(LOGIN_FILE)) {
//            writer.write(jsonArray.toJSONString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
//	
//	public User registerUser(String fullName, String email, String password, String area) {
//		
//		User newUser = new User(fullName, email, password, area);
//		userList.add(newUser);
//		saveUserData();
//		return newUser;
//	}
//	
//	public boolean authenticateUser(String email, String password) {
//		
//		for(User user: userList) {
//			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	//get single user by email
//	public User getUserByEmail(String email) {
//		for(User user: userList) {
//			if(user.getEmail().equals(email)) {
//				return user;
//			}
//		}
//		return null;
//	}
//	
//	//get all users
//	public List<User> getAllUsers(){
//		return userList;
//	}
//}
