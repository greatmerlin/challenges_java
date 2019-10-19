package ffhs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene mainScene = new Scene(root, 400, 200);

        mainScene.getStylesheets().add(Main.class.getResource("styles.css").toExternalForm());

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(mainScene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}