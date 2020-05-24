package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.impl.PresenceServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class NewWorkerController {

    @FXML private javafx.scene.control.Button exitButton;

    MenuController menuController = new MenuController();

    @FXML
    private Label sectionNameLabel;

    PresenceService presenceService = new PresenceServiceImpl();

    public void initialize(){
        sectionNameLabel.setText(menuController.temp);
    }

    @FXML
    private void backToMainMenu() throws IOException {

        App.setRoot("menu");
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }

    public Label getSectionNameLabel() {
        return sectionNameLabel;
    }

    public void setSectionNameLabel(Label sectionNameLabel) {
        this.sectionNameLabel = sectionNameLabel;
    }

    public PresenceService getPresenceService() {
        return presenceService;
    }

    public void setPresenceService(PresenceService presenceService) {
        this.presenceService = presenceService;
    }
}