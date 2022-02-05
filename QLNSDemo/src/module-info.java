module QLNSDemo {
	exports application.Login;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.Login;
}