package com.example.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        //        GridPane fxmlLoader = new GridPane();
//        fxmlLoader.setAlignment(Pos.CENTER);
//        fxmlLoader.setVgap(20.0);
//        fxmlLoader.setHgap(20.0);
//        Label greeting = new Label("Welcome to JavaFX!");
//        fxmlLoader.getChildren().add(greeting);
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));

        //Scene is the high level container of the view
        Scene scene = new Scene(fxmlLoader.load(), 700, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}