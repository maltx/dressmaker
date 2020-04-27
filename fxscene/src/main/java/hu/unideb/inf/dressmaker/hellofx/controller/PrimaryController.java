package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.impl.SectionServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class PrimaryController {

    SectionService sectionService = new SectionServiceImpl();


    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println(sectionService.findAll());

        App.setRoot("secondary");


    }
}
