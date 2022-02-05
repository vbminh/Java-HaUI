module QLNS {
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application.Controller to javafx.graphics, javafx.fxml; 
}