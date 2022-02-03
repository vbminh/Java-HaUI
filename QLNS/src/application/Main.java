package application;
	
import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Main extends Application {
	Stage window;
	Scene login, home;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			window.setTitle("Vu Binh Minh-QLNS");
			
			InputStream url = Main.class.getResourceAsStream("/logo.jpg");
			Image img = new Image(url,204,152, false, false);
			ImageView imgview = new ImageView(img);
			
			Label title = new Label("Truong Dai hoc Cong Nghiep Ha Noi\nKhoa CNTT");
			;
			title.setGraphicTextGap(10);
			title.setAlignment(Pos.CENTER);
			title.maxHeight(50);
			title.maxWidth(200);
			title.setId("label1");
			Button bt = new Button("Hello world");
			
			Button bt2 = new Button("Hello");
			bt2.setAlignment(Pos.CENTER);
			
			GridPane grid = new GridPane();
			grid.getColumnConstraints().add(new ColumnConstraints(20));
			grid.getColumnConstraints().add(new ColumnConstraints(150));
			grid.getColumnConstraints().add(new ColumnConstraints(10));
			grid.getColumnConstraints().add(new ColumnConstraints(150));
			grid.getColumnConstraints().add(new ColumnConstraints(20));
			
			grid.add(imgview,0,0,5,1);
			grid.add(title,0,1,5,1);
			grid.add(bt, 1, 2, 1, 1);
			grid.add(bt2, 3, 4, 1, 1);
			
			grid.setHalignment(imgview, HPos.CENTER);

			grid.setHalignment(bt2, HPos.CENTER);
			grid.setGridLinesVisible(true);
			grid.setId("gird");
		
			Scene scene = new Scene(grid,370,600);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
