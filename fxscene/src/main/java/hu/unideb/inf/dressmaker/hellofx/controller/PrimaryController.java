package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        
    }
}
