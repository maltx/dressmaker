package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.impl.SectionServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    SectionService sectionService = new SectionServiceImpl();

    @FXML private javafx.scene.control.Button exitButton;

    @FXML
    private ChoiceBox presenceCB;

    public void initialize(){
        presenceCB.getItems().addAll(sectionService.findAll());
    }

    @FXML
    private void openPresenceScene() throws IOException {
        App.setRoot("presence");
    }

    @FXML
    private void openNewWorkerScene() throws IOException {
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
}
