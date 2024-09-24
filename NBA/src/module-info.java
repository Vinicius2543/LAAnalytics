module NBA {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens usa.com.nba.atletas to javafx.graphics, javafx.fxml;
}
