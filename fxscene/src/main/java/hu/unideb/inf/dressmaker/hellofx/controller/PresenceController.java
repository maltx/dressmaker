package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class PresenceController {
    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("menu");
    }
}
