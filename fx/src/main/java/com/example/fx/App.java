package com.example.fx;
import javafx.application.Application;//javafx application library
import javafx.scene.Scene;//scene library
import javafx.scene.control.Label;//label for scene library
import javafx.stage.Stage;//stage library

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Merhaba, JavaFX");

        Scene scene = new Scene(label, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("İlk javaFX Uygulamam");

        primaryStage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
