module audi {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires jtds;
	
	opens application to javafx.fxml, javafx.graphics, javafx.controls;
	opens DAO;
}