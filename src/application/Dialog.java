package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.FileReader;

public class Dialog {
	
	@FXML
	public Label dialog_lbl;
	public void OKButtonPressed(ActionEvent e) {
		Node source=(Node)e.getSource();
		Stage stage=(Stage)source.getScene().getWindow();
		stage.close();
		
	}
	public void setDialogText(String s) {
		dialog_lbl.setText(s);
	}
	

}
