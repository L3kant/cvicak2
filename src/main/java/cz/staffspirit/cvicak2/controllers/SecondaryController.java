package cz.staffspirit.cvicak2.controllers;

import cz.staffspirit.cvicak2.App;
import cz.staffspirit.cvicak2.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}