module com.example.javaworkspace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaworkspace to javafx.fxml;
    exports com.example.javaworkspace;
}