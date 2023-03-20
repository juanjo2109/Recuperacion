module com.example.recuperacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recuperacion to javafx.fxml;
    exports com.example.recuperacion;
}