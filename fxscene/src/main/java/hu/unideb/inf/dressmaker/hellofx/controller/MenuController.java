package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.impl.SectionServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;

public class MenuController {

    SectionService sectionService = new SectionServiceImpl();

    //NewWorkerController newWorkerController = new NewWorkerController();

    @FXML private javafx.scene.control.Button exitButton;

    @FXML
    private static Label tempLabel;

    @FXML
    private ChoiceBox presenceCB;

    @FXML
    private ChoiceBox newWorkerCB;

    public void initialize(){
        presenceCB.getItems().addAll(sectionService.findSectionNames());
        newWorkerCB.getItems().addAll(sectionService.findSectionNames());
    }

    @FXML
    private void openPresenceScene() throws IOException {
        App.setRoot("presence");
    }

    @FXML
    private void openNewWorkerScene() throws IOException {
        //tempLabel.setText(newWorkerCB.getSelectionModel().getSelectedItem().toString());
        //newWorkerController.setSectionNameLabel(tempLabel);
        App.setRoot("newWorker");
    }

    @FXML
    private void openDeleteWorkerScene() throws IOException{
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

    public static Label getTempLabel() {
        return tempLabel;
    }

    public static void setTempLabel(Label tempLabel) {
        MenuController.tempLabel = tempLabel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
