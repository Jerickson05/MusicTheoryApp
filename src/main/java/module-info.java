module com.jeric {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jeric to javafx.fxml;
    exports com.jeric;
}
