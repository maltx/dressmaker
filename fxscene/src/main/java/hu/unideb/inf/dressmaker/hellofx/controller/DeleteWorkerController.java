package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.impl.WorkerServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class DeleteWorkerController {
    WorkerService workerService = new WorkerServiceImpl();

    MenuController menuController = new MenuController();

    @FXML
    private javafx.scene.control.Button exitButton;

    @FXML
    private Label sectionNameLabel;

    @FXML
    private ChoiceBox workersCB;

    public void initialize(){
        sectionNameLabel.setText(menuController.temp.toString());
        workersCB.getItems().addAll(workerService.findWorkersBySection(menuController.temp.toString()));
    }

    @FXML
    private void deleteWorker(){
        WorkerVO workerVO = (WorkerVO) workersCB.getSelectionModel().getSelectedItem();
        workerService.remove(workerVO);
    }

    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("menu");
    }
}
