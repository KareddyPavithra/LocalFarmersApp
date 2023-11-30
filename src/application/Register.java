package application;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Register {
	
	@FXML
	private TextField user_register;
	@FXML
	private TextField user_password;
	@FXML
	private Label error_box;
	
	private String path=((Paths.get("Login.json")).toAbsolutePath()).toString();
	
	@FXML
	public void register() throws IOException, ParseException{
		String username=user_register.getText(),password=user_password.getText();
		JSONParser jsonParser=new JSONParser();
		Object jsonObject=jsonParser.parse(new FileReader(path));
		JSONObject json=(JSONObject)jsonObject;
		if(json.containsKey(username)) {
			error_box.setText("Username exists, please re-login");
		    return;}
		else
			json_add(username,password);
		error_box.setText("Account created!");		
	}
	
	@FXML
	public void back(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
		Scene scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	private void json_add(String s1,String s2) {
		JSONParser jsonParser=new JSONParser();
		Object jsonObject;
		try {
			jsonObject=jsonParser.parse(new FileReader(path));
			JSONObject json=(JSONObject)jsonObject;
			json.put(s1, s2);
			FileWriter file=new FileWriter(path,false);
			file.write(json.toJSONString());
			file.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}	
	
}
