package hu.unideb.inf.dressmaker.hellofx.controller;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;
import hu.unideb.inf.dressmaker.clientapi.modell.StatusVO;
import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;
import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.clientapi.service.StatusService;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.database.entity.Presence;
import hu.unideb.inf.dressmaker.core.service.impl.PresenceServiceImpl;
import hu.unideb.inf.dressmaker.core.service.impl.StatusServiceImpl;
import hu.unideb.inf.dressmaker.core.service.impl.WorkerServiceImpl;
import hu.unideb.inf.dressmaker.hellofx.main.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PresenceController {
    MenuController menu = new MenuController();
    WorkerService workerService = new WorkerServiceImpl();
    StatusService statusService = new StatusServiceImpl();
    PresenceService presenceService = new PresenceServiceImpl();

    private ObservableList<WorkerVO> workers;

    @FXML
    private TableView table;

    @FXML
    private TableColumn id;

    @FXML
    private TableColumn name;

    @FXML
    private ChoiceBox statusCB;

    @FXML
    private Label sectionNameLabel;

    public void initialize(){
        sectionNameLabel.setText(menu.temp.toString());
        workers = FXCollections.observableArrayList(workerService.findWorkersBySection(menu.temp.toString()));
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        table.setItems(workers);
        statusCB.getItems().addAll(statusService.findAll());
    }

    @FXML
    private void save(){
        PresenceVO presenceVO = new PresenceVO();
        WorkerVO workerVO = (WorkerVO) table.getSelectionModel().getSelectedItem();
        StatusVO statusVO = (StatusVO) statusCB.getSelectionModel().getSelectedItem();
        Date date = new Date(System.currentTimeMillis());
        presenceVO.setWorker(workerVO);
        presenceVO.setSection(menu.temp);
        presenceVO.setStatus(statusVO);
        presenceVO.setDatum(date);
        presenceService.persist(presenceVO);
    }

    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("menu");
    }
}
