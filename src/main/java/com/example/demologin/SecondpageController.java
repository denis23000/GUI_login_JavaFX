package com.example.demologin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.io.IOException;
public class SecondpageController {
    @FXML
    private Button backbutton;
    @FXML
    private Button continuebutton;
    @FXML
    void logout(ActionEvent event)  throws IOException   {
        HelloApplication m = new HelloApplication();
        m.changeScene( "hello-view.fxml");
    }
    @FXML
    void continue_action(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene( "continuepage.fxml");
    }
}
