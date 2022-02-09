package application.Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import ConnectSQL.ConnectionUtils;
import application.Models.Account;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable{
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private ImageView aa;
	
	private Account account;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void login() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Thông báo");
		
		if(username.getText().trim().equals("") || password.getText().trim().equals("")) {
			alert.setContentText("Tên đăng nhập hoặc mật khẩu không được để trống");
			alert.showAndWait();
		}
		else if(username.getText().contains(" ") || password.getText().contains(" ")) {
			alert.setContentText("Tên đăng nhập hoặc mật khẩu không được chứa dấu cách");
			alert.showAndWait();
		}
		else {
			try {
				Connection connection = ConnectionUtils.getMyConnection();
				Statement statement = connection.createStatement();
				String sql = "Select * from BGH";
				ResultSet rs = statement.executeQuery(sql);
				
				if(rs.next()) {
					String name = rs.getString(1);
					String pass = rs.getString(2);
					String permission = rs.getString(3);
					Account acc = new Account(name, pass, permission);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	 
}
