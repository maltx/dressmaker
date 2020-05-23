package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.impl.PresenceServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lombok.Data;

import java.io.IOException;

public class NewWorkerController {

    @FXML private javafx.scene.control.Button exitButton;

    MenuController menuController = new MenuController();

    @FXML
    private Label sectionNameLabel;

    private String sectionName;

    PresenceService presenceService = new PresenceServiceImpl();

    public void initialize(){
        //sectionNameLabel.setText(menu.getNewWorkerCB().getSelectionModel().getSelectedItem().toString());
        //sectionNameLabel.setText("ember");
        //menuController.
    }

    @FXML
    private void backToMainMenu() throws IOException {
        System.out.println(sectionName);
        App.setRoot("menu");
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
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