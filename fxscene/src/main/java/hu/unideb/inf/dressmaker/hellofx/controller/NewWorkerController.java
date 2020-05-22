package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.impl.PresenceServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class NewWorkerController {

    @FXML private javafx.scene.control.Button exitButton;

    PresenceService presenceService = new PresenceServiceImpl();

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void exit() throws IOException {
        App.setRoot("menu");
    }
}