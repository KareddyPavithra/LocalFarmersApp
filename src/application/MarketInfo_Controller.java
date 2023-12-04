package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MarketInfo_Controller {

	
	@FXML
	private Stage stage;
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	
	@FXML
	private void closeMarketInfo(ActionEvent event) {
		stage.close();
	}
}
