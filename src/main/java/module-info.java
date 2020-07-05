module cz.staffspirit.cvicak2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens cz.staffspirit.cvicak2 to javafx.fxml;
    exports cz.staffspirit.cvicak2;
}
