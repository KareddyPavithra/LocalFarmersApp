package application;

import java.io.FileReader;
import java.nio.file.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.File;

public class LogIn {

    @FXML
    private TextField usrname;
    @FXML
    private TextField pswd;
    @FXML
    private Button btn_login;
    @FXML
    private ImageView img_login;


    @FXML
    public void login(ActionEvent e) {
        // File file = new File("login.json");
        // String path = file.getAbsolutePath();
        String username = usrname.getText(), password = pswd.getText();
        JSONParser jsonParser = new JSONParser();
        Object jsonObject;
        Path path = (Paths.get("login.json"));
        try {
            jsonObject = jsonParser.parse(new FileReader(path.toString()));
            JSONObject json = (JSONObject) jsonObject;
            if (json.containsKey(username)) {
                if (((String) json.get(username)).equals(password)) {

                    /* change scene to shopping */
                    Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
                    Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                } else {
                    /* invoke the wrong username/password dialog */
                    FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Dialog.fxml"));
                    Parent parent = fxmlloader.load();
                    Dialog d_controller = fxmlloader.<Dialog>getController();
                    d_controller.setDialogText("Incorrect username/password entered.");
                    Scene scene = new Scene(parent);
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setScene(scene);
                    stage.showAndWait();

                }
            } else {
                /* show a dialog saying username not present, re-enter or register this username */
                FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Dialog.fxml"));
                Parent parent = fxmlloader.load();
                Dialog d_controller = fxmlloader.<Dialog>getController();
                d_controller.setDialogText("User not available, kindly re-enter or register this username.");
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.showAndWait();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void register(ActionEvent e) throws IOException {
        /* change scene to register_screen */
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
