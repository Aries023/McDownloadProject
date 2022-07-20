module com.example.mcdownload {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mcdownload to javafx.fxml;
    exports com.example.mcdownload;
}