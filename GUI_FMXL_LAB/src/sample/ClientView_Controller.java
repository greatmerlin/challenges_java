package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientView_Controller implements Initializable {

    private Client selectedClient;

    @FXML private Label firstNameLabel;
    @FXML private Label lastNameLabel;
    @FXML private Label birthdayLabel;
    @FXML private Label ageLabel;

    public void initData(Client client) {

        selectedClient = client;
        firstNameLabel.setText(selectedClient.getFirstName());
        lastNameLabel.setText(selectedClient.getFirstName());
        birthdayLabel.setText(selectedClient.getBirthday().toString());
        ageLabel.setText(Integer.toString(selectedClient.getAge()));
    }

    public void goBackToTableViewSceneButton(ActionEvent event) throws IOException {

        Parent secondScene = FXMLLoader.load(getClass().getResource("fxml_TableView.fxml"));

        Scene tableViewScene = new Scene(secondScene,800,600);

        //we need sth to get the STAGE information like in main :  public void start(Stage primaryStage)

        Stage mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        mainStage.setScene(tableViewScene);
        mainStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
