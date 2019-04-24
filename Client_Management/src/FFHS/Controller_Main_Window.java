package FFHS;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller_Main_Window {

    @FXML
    private TableView<Client> tableView;
    @FXML
    private TextField fistNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField dateOfBirthField;

    @FXML
    protected void addPerson(ActionEvent event) {

        ObservableList<Client> data = tableView.getItems();

        data.add(new Client(fistNameField.getText(),
                            lastNameField.getText(),
                            dateOfBirthField.getText()));

        fistNameField.setText("");
        lastNameField.setText("");
        dateOfBirthField.setText("");
    }
}
