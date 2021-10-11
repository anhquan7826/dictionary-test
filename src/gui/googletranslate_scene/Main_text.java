package gui.googletranslate_scene;

import dictionary.Operate;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main_text extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Operate.initOperation();
        Parent root = FXMLLoader.load(getClass().getResource("GoogleTranslate.fxml"));
        primaryStage.setTitle("Translate");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
