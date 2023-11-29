package ui;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import controllers.UserController;
import javafx.application.Application;
import javafx.event.ActionEvent;


public class UserLogin extends Application{

	@FXML
	private TextField usernameField;
	
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private Button loginButton;
	
	@FXML
	private Label errorLabel;
	
	private UserController userController;
	
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("user_login.fxml"));
			loader.setController(this);
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("User Login");
			
			primaryStage.show();
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@FXML
	private void handleLogin() {
        
        String email = usernameField.getText();
        String password = passwordField.getText();
        
	    if(userController.authenticateUser(email, password)) {
	    	openMainPage();
	    } else {
	    	errorLabel.setText("Invalid email or password");
	    }
	}
	
	private void openMainPage() {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("main_page.fxml"));
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			
			Stage stage = (Stage) loginButton.getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("Main Page");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		        
		launch(args);
	}

	

}
