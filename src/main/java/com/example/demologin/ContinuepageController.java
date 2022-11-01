package com.example.demologin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ContinuepageController {

    @FXML
    private Button back_button;
    @FXML
    private Button logout_button;
    @FXML
    void logout(ActionEvent event)  throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }
    @FXML
    void back_action(ActionEvent event)  throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("secondpage.fxml");
    }
}
