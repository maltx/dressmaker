package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.impl.WorkerServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class PresenceController {
    MenuController menu = new MenuController();
    WorkerService workerService = new WorkerServiceImpl();

    @FXML
    private Label sectionNameLabel;

    public void initialize(){
        sectionNameLabel.setText("man");
    }

    @FXML
    private void backToMainMenu() throws IOException {
        System.out.println(workerService.findWorkersBySection("IT"));
        App.setRoot("menu");
    }
}
