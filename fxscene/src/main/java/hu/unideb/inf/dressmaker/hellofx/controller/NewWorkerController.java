package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.impl.PresenceServiceImpl;
import hu.unideb.inf.dressmaker.core.service.impl.WorkerServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class NewWorkerController {

    @FXML private javafx.scene.control.Button exitButton;

    WorkerService workerService = new WorkerServiceImpl();

    MenuController menuController = new MenuController();

    @FXML
    private TextField newWorkerTF;

    @FXML
    private Label sectionNameLabel;

    PresenceService presenceService = new PresenceServiceImpl();

    public void initialize(){
        sectionNameLabel.setText(menuController.temp.toString());
    }

    @FXML
    private void newWorker(){
        System.out.println(newWorkerTF.getText());
        workerService.persist(newWorkerTF.getText(), menuController.temp);
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