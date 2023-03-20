package com.example.recuperacion;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onMessButtonClick() {
        welcomeText.setText("Datos almacenados");
    }
}