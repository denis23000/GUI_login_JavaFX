package com.example.demologin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import java.io.IOException;

public class HelloController {

    @FXML
    private TextField username_field;
    @FXML
    private PasswordField passfield;
    @FXML
    private Button login_button;
    @FXML
    private Label errormassage;
    @FXML
    void login_action(ActionEvent event) throws IOException {
        chekLogin();
    }

    private void chekLogin() throws IOException {
        HelloApplication m = new HelloApplication();
        String username = username_field.getText();
        String password = passfield.getText();
        if(username.equals("user") && password.equals("1234")) {
            m.changeScene( "secondpage.fxml"); }
        else  { errormassage.setText("Error! Wrong username or password. Try again.");
                username_field.setText("");
                passfield.setText("");
        }

    }

}