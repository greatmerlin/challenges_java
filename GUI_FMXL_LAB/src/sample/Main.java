package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent firstScene = FXMLLoader.load(getClass().getResource("sample.fxml")); // we save the fxml to the var "firstScene"

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(firstScene, 800, 600));   // we load the first Scene into our Stage.
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
