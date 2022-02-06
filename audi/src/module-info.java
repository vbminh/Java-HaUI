module audi {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires sqljdbc42;
	requires jtds;
	
	opens application;
	opens DAO;
}