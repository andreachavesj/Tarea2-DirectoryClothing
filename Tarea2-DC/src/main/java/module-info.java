module com.example.tarea2dc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea2dc to javafx.fxml;
    exports com.example.tarea2dc;
}