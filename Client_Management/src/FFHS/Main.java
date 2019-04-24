package FFHS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Pane myPane = FXMLLoader.load(getClass().getResource("fxml_mainWindow.fxml"));

        Scene myScene = new Scene(myPane);

        primaryStage.setTitle("My Business App");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
