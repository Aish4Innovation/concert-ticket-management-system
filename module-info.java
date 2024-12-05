module Project {
    requires javafx.controls; // Required for JavaFX controls
    requires javafx.fxml;
	requires java.sql; // Required if using FXML
    
    opens application; // Export your application package
}
