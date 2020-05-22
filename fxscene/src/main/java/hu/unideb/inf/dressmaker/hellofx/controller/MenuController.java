package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.impl.SectionServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML private javafx.scene.control.Button exitButton;

    SectionService sectionService = new SectionServiceImpl();


    @FXML
    private void openPresenceScene() throws IOException {
        App.setRoot("presence");
    }

    @FXML
    private void openNewWorkerScene() throws IOException {
        App.setRoot("newWorker");
    }

    @FXML
    private void exit() throws IOException {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
