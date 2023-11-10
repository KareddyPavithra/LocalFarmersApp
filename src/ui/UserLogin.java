package ui;

import controllers.UserController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import services.UserService;

public class UserLogin extends Application{

	
	private UserService userService;
	
	public UserLogin() {
		this.userService = userService;
	}
	
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("User Login");
		
		Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("Login");
		
        loginButton.setOnAction(e -> handleLogin(emailTextField.getText(), passwordField.getText()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(emailLabel, emailTextField, passwordLabel, passwordField, loginButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	
	private void handleLogin(String email, String password) {
        
        boolean isAuthenticated = userService.authenticateUser(email, password);

        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your email and password.");
        }
    }
	
	public static void main(String[] args) {
		
		UserService userService = new UserService(new UserController());
        UserLogin userLogin = new UserLogin();
        
		launch(args);
	}

	

}
