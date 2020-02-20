package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}