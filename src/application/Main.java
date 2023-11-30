package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root1 = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene1 = new Scene(root1,800,600);
			primaryStage.setScene(scene1);
			//primaryStage.getIcons().add(new Image("file:./assets/login2.jpeg"));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
