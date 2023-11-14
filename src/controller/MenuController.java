package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.AppModel;

public class MenuController implements Initializable{

	// buttons
	@FXML
	private Button buttonReport;
	
	@FXML
	private Button buttonProyection;
	
	@FXML
	private Button buttonGraphics;
	
	// label
	@FXML
	private Label labelWelcome;
	
	@Override
	public void initialize(URL url, ResourceBundle resource) {
		
		this.labelWelcome.setText("Welcome back " + AppModel.getCurrentUser() + "!");
		
	}

}
