package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.impl.PresenceServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class SecondaryController {

    PresenceService presenceService = new PresenceServiceImpl();

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");

        System.out.println(presenceService.findALl());
    }
}