package FFHS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Pane myPane = FXMLLoader.load(getClass().getResource("fmxl_Main_Window.fxml"));

        Scene myScene = new Scene(myPane, 500,500);

        primaryStage.setTitle("My Business App");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
