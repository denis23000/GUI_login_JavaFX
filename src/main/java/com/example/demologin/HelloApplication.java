package com.example.demologin;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Log-in project");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void HelloApplication(String[] args) {
        launch(args);
    }
}