package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class TableView_Controler implements Initializable {

    @FXML private TableView<Client> tableView;
    @FXML private TableColumn<Client, String> firstColumn;
    @FXML private TableColumn<Client, String> secondColumn;
    @FXML private TableColumn<Client, LocalDate> birthdayColumn;

    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private DatePicker birthdayDatepicker;

    public void addClientButtonPushed() {

        Client newClient = new Client(  firstNameTextField.getText(),
                                        lastNameTextField.getText(),
                                        birthdayDatepicker.getValue());

        tableView.getItems().add(newClient);
    }

    public void editFirstName(TableColumn.CellEditEvent editedCell){

        Client clientSelected = tableView.getSelectionModel().getSelectedItem(); // return a person Object, the one that we select

        clientSelected.setFirstName(editedCell.getNewValue().toString());

    }

    public void editLastName(TableColumn.CellEditEvent editedCell){

        Client clientSelected = tableView.getSelectionModel().getSelectedItem(); // return a person Object, the one that we select

        clientSelected.setLastName(editedCell.getNewValue().toString());
    }

    public void goBackToMainWindowButton(ActionEvent event) throws IOException {

        Parent secondScene = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene tableViewScene = new Scene(secondScene,800,600);

        //we need sth to get the STAGE information like in main :  public void start(Stage primaryStage)

        Stage mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        mainStage.setScene(tableViewScene);
        mainStage.show();
    }

    public void initialize(URL location, ResourceBundle resources) {

        firstColumn.setCellValueFactory(new PropertyValueFactory<Client, String>("firstName"));
        secondColumn.setCellValueFactory(new PropertyValueFactory<Client, String>("lastName"));
        birthdayColumn.setCellValueFactory(new PropertyValueFactory<Client, LocalDate>("birthday"));

        tableView.setItems(getClients());

        tableView.setEditable(true);
        firstColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        secondColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    public void deleteButtonPushed() {

        ObservableList<Client> selectedRows, allClients;

        allClients = tableView.getItems();

        selectedRows = tableView.getSelectionModel().getSelectedItems();

        for (Client client : selectedRows) {

            allClients.remove(client);
        }
    }

    public ObservableList<Client> getClients() {

        ObservableList<Client> clients = FXCollections.observableArrayList();
        clients.add(new Client("Theo", "Bax", LocalDate.of(1991, Month.APRIL,29)));
        clients.add(new Client("max", "muster", LocalDate.of(1995,Month.DECEMBER, 6)));
        clients.add(new Client("Peter", "alone", LocalDate.of(1998,Month.JANUARY,5)));

        return clients;
    }

    public void changeSceneToDetailedPersonView(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("fxml_ClientView.fxml"));

        Parent thirdScene = loader.load();

        Scene tableViewScene = new Scene(thirdScene,800,600);

        // access the controller and call a method

        ClientView_Controller controller = loader.getController();
        controller.initData(tableView.getSelectionModel().getSelectedItem());

        //we need sth to get the STAGE information like in main :  public void start(Stage primaryStage)

        Stage mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        mainStage.setScene(tableViewScene);
        mainStage.show();
    }


}
