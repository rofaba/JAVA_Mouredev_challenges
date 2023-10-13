module com.example.retosmouredev {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mouredevreto16 to javafx.fxml;
    exports com.example.mouredevreto16;
}