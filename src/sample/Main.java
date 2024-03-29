package sample;

import MemoryDust.RPGElements.GameLogic;
import MemoryDust.RPGElements.Room;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {

    public Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 575));
        primaryStage.show();
        controller = loader.getController();
        GameLogic gameLogic = new GameLogic(controller);
        gameLogic.initialize();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
