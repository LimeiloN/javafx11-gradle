module com.example.jfxapp {
	
	exports com.example.jfxapp;
	
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.base;
	
	opens com.example.jfxapp to javafx.fxml;
}