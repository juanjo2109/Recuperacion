package com.example.recuperacion;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
        Text text1 = new Text("Nombre");
        Text text2 = new Text("Apellidos");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        GridPane gridPane = new GridPane();
        HBox  hbx=new HBox();
        HBox  hbx1=new HBox();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(hbx, 1,2 );
        gridPane.add(hbx1, 1,3 );
        hbx.setSpacing(10);
        hbx.setAlignment(Pos.CENTER);
        hbx1.setSpacing(15);
        Button button1 ;

        hbx.getChildren().addAll(
                button1 = new Button("Enviar")

        );


        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label label = new Label("Datos almacenados");
                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(label);

                Scene secondScene = new Scene(secondaryLayout, 230, 100);

                // Nueva Ventana (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Ventana emergente");
                newWindow.setScene(secondScene);

                // Specifies the modality for new window.
                newWindow.initModality(Modality.WINDOW_MODAL);

                // Specifies the owner Window (parent) for new window
                newWindow.initOwner(stage);

                // Set position of second window, related to primary window.
                newWindow.setX(stage.getX() + 200);
                newWindow.setY(stage.getY() + 100);

                newWindow.show();

            }
        });

        button1.setMaxWidth(500);
        button1.setMinWidth(250);
        button1.setMaxHeight(40);
        button1.setMinHeight(20);
        Scene scene = new Scene(gridPane);
        stage.setTitle("Recuperacion");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}