package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.StatusService;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.impl.StatusServiceImpl;
import hu.unideb.inf.dressmaker.core.service.impl.WorkerServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class PresenceController {
    MenuController menu = new MenuController();
    WorkerService workerService = new WorkerServiceImpl();
    StatusService statusService = new StatusServiceImpl();

    @FXML
    private Label sectionNameLabel;

    public void initialize(){
        sectionNameLabel.setText("Mai jelenlétek");
    }

    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("menu");
    }
}
