package hu.unideb.inf.dressmaker.hellofx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"));
        scene.getStylesheets().add(App.class.getResource("/view/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view/" + fxml + ".fxml"));
        //return fxmlLoader.load();
        return FXMLLoader.load(Objects.requireNonNull(App.class.getClassLoader().getResource("view/" + fxml + ".fxml")));
    }

    public static void main(String[] args) {
        launch(args);
    }

}