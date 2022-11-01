module com.example.demologin {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.demologin to javafx.fxml;
    exports com.example.demologin;
}