package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import DAO.*;
import JDBC.ConnnectionUtils;

public class Controller implements Initializable{
	@FXML
	private TableView<NV> table;
	@FXML
	private TableColumn<NV, String> manvcolumn;
	@FXML
	private TableColumn<NV, String> hotencolumn;
	@FXML
	private TableColumn<NV, String> gtinhcolumn;
	@FXML
	private TableColumn<NV, String> ngsinhcolumn;
	@FXML
	private TableColumn<NV, String> diachicolumn;
	@FXML
	private TableColumn<NV, String> sdtcolumn;
	@FXML
	private TableColumn<NV, String> emailcolumn;
	@FXML
	private TableColumn<NV, String> ngayvaolamcolumn;
	@FXML
	private TableColumn<NV, String> chucdanhcolumn;
	@FXML
	private TableColumn<NV, String> chucvucolumn;
	@FXML
	private TableColumn<NV, Double> luongcolumn;
	@FXML
	private TableColumn<NV, String> ghichucolumn;
	
	private ObservableList<NV> list= FXCollections.observableArrayList();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			/*
			 * Connection connection = ConnnectionUtils.getMyConnection(); Statement
			 * statement = connection.createStatement(); String sql = "Select * from BGH";
			 * ResultSet rs = statement.executeQuery(sql); while (rs.next()) { String manv =
			 * rs.getString(1); String hoten = rs.getString(2); String gtinh =
			 * rs.getString(3); String ngsinh = rs.getDate(4).toString(); String dchi =
			 * rs.getString(5); String sdt = rs.getString(6); String email =
			 * rs.getString(7); String ngayvaolam = rs.getDate(8).toString(); String
			 * chucdanh = rs.getString(9); String chucvu = rs.getString(10); double luongcb
			 * = rs.getDouble(11); String ghichu = rs.getString(12);
			 * 
			 * NV nv = new NV(manv, hoten, gtinh, ngsinh, dchi, sdt, email, ngayvaolam,
			 * chucdanh, chucvu, ghichu, luongcb); list.add(nv); } connection.close();
			 */
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*
		 * manvcolumn.setCellValueFactory(new PropertyValueFactory<NV, String>("manv"));
		 * hotencolumn.setCellValueFactory(new PropertyValueFactory<NV,
		 * String>("hoten")); gtinhcolumn.setCellValueFactory(new
		 * PropertyValueFactory<NV, String>("gtinh"));
		 * ngsinhcolumn.setCellValueFactory(new PropertyValueFactory<NV,
		 * String>("ngsinh")); ngayvaolamcolumn.setCellValueFactory(new
		 * PropertyValueFactory<NV, String>("ngayvaolam"));
		 * chucdanhcolumn.setCellValueFactory(new PropertyValueFactory<NV,
		 * String>("chucdanh")); chucvucolumn.setCellValueFactory(new
		 * PropertyValueFactory<NV, String>("chucvu"));
		 * luongcolumn.setCellValueFactory(new PropertyValueFactory<NV,
		 * Double>("luongcoban")); ghichucolumn.setCellValueFactory(new
		 * PropertyValueFactory<NV, String>("ghichu")); table.setItems(list);
		 */
	
	}

	@FXML
	public void back(ActionEvent event) {
	}
	
}
