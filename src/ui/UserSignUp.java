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

public class UserSignUp extends Application{

	private UserController userController; 

    public UserSignUp() {
        this.userController = userController;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     UserSignUp userSignup = new UserSignUp();
	        
	     launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("User Signup");

        Label fullNameLabel = new Label("Full Name:");
        TextField fullNameTextField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Label areaLabel = new Label("Area:");
        TextField areaTextField = new TextField();

        Button signupButton = new Button("Sign Up");

        signupButton.setOnAction(e -> handleSignup(
                fullNameTextField.getText(),
                emailTextField.getText(),
                passwordField.getText(),
                areaTextField.getText()
        ));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(fullNameLabel, fullNameTextField, emailLabel, emailTextField,
                passwordLabel, passwordField, areaLabel, areaTextField, signupButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
	}
	
	private void handleSignup(String fullName, String email, String password, String area) {
		
		userController.registerUser(fullName, email, password, area);

        System.out.println("User registration successful!");
    }


}
