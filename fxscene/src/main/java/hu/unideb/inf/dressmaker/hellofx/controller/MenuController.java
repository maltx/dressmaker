package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.impl.SectionServiceImpl;
import hu.unideb.inf.dressmaker.core.service.impl.WorkerServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;

public class MenuController {

    SectionService sectionService = new SectionServiceImpl();

    static SectionVO temp;

    @FXML private javafx.scene.control.Button exitButton;

    @FXML
    private ChoiceBox presenceCB;

    @FXML
    private ChoiceBox newWorkerCB;

    public void initialize(){
        presenceCB.getItems().addAll(sectionService.findAll());
        newWorkerCB.getItems().addAll(sectionService.findAll());
    }

    @FXML
    private void openPresenceScene() throws IOException {
        App.setRoot("presence");
    }

    @FXML
    private void openNewWorkerScene() throws IOException {
        temp = (SectionVO) newWorkerCB.getSelectionModel().getSelectedItem();
        App.setRoot("newWorker");
    }

    @FXML
    private void openDeleteWorkerScene() throws IOException{
        temp = (SectionVO) newWorkerCB.getSelectionModel().getSelectedItem();
        App.setRoot("deleteWorker");
    }

    @FXML
    private void exit() throws IOException {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public ChoiceBox getPresenceCB() {
        return presenceCB;
    }

    public void setPresenceCB(ChoiceBox presenceCB) {
        this.presenceCB = presenceCB;
    }

    public ChoiceBox getNewWorkerCB() {
        return newWorkerCB;
    }

    public void setNewWorkerCB(ChoiceBox newWorkerCB) {
        this.newWorkerCB = newWorkerCB;
    }

    public SectionService getSectionService() {
        return sectionService;
    }

    public void setSectionService(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
