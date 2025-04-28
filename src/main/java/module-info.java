module com.jeric {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.jeric to javafx.fxml;
    exports com.jeric;
}
