package application.Login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	@FXML
	private Label SchoolName, AppName;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Button login;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	public void login(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Vu Binh Minh-Alert");
		alert.setHeaderText("Thong bao");
		
		if(username.getText().trim().isEmpty() || password.getText().trim().isEmpty()) {
			alert.setContentText("Ten dang nhap hoac mat khau khong duoc bo trong");
			alert.showAndWait();
		}
		else if(username.getText().contains(" ") || password.getText().contains(" ")) {
			alert.setContentText("Ten dang nhap hoac mat khau khong duoc chu dau cach");
			alert.showAndWait();
		}
		else {
			alert.setContentText("Dang nhap thanh cong voi quyen " + username.getText());
			alert.showAndWait();
			
			try {
				Parent root = FXMLLoader.load(this.getClass().getResource("/application/Home/Home.fxml"));
				Scene scene = new Scene(root,500,400);
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				
				Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
