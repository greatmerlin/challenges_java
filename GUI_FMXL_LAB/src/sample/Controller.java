package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Label secretLabel;
    @FXML private CheckBox plugCBox;
    @FXML private CheckBox pfCBox;
    @FXML private CheckBox stCBox;

    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;

    @FXML private ComboBox comboBox;
    @FXML private Label comboLabel;

    @FXML private RadioButton mis1;
    @FXML private RadioButton mis2;
    @FXML private RadioButton mis3;
    @FXML private Label radioLabel;

    @FXML private ListView listView;
    @FXML private TextArea myTextArea;

    public void changeSceneButtonPushed(ActionEvent event) throws IOException {

        Parent secondScene = FXMLLoader.load(getClass().getResource("fxml_TableView.fxml"));

        Scene tableViewScene = new Scene(secondScene,800,600);

        //we need sth to get the STAGE information like in main :  public void start(Stage primaryStage)

        Stage mainStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        mainStage.setScene(tableViewScene);
        mainStage.show();
    }

    public void listViewButton() {

        String textAreaString = "";

        ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();  // return the selected items as an Observable list and store this list into this String variable

        for (Object item : listOfItems)  {   // emeis 3eroume oti einai ena array apo strings, alla to systima den to 3erei at this point
            textAreaString += String.format("%s%n",(String)item); // append the objects into this var and turn them into Strings

            myTextArea.setText(textAreaString);  // add them one by one
        }
    }

    private ToggleGroup misToggleGroup;

    public void changeToggleLabel() {

        if(this.misToggleGroup.getSelectedToggle().equals(this.mis1)){
            radioLabel.setText("you will be f by mis1");
        }

        if(this.misToggleGroup.getSelectedToggle().equals(this.mis2)){
            System.out.println("You have selected mis2");
            radioLabel.setText("you will be f by mis2");
        }

        if(this.misToggleGroup.getSelectedToggle().equals(this.mis3)){
            System.out.println("you have selected mis3");
            radioLabel.setText("you will be f by mis3");
        }
    }

    public void comboSelected(){

        comboLabel.setText("where to pss me: " + comboBox.getValue().toString());
    }

    public void choiceBoxButtonPushed(){

        choiceBoxLabel.setText(choiceBox.getValue().toString());
    }


    public void orderButtonPushed(){

        // create a variable and put some String in it
        String order = "On discount is:";      // create a screen

        if (plugCBox.isSelected()){    // everytime a checkbox is selected the appropriate text will be added
            order += "\nthe bigPlug";
        }
        if (pfCBox.isSelected()){
            order += "\nwith one with perles";
        }
        if (stCBox.isSelected()){
            order += "\nthe big one";
        }

        this.secretLabel.setText(order);   // set the secret text according the checked checkbox
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        secretLabel.setText("");

        choiceBoxLabel.setText("");
        choiceBox.getItems().add("lubricate");
        choiceBox.getItems().add("vjuice");
        choiceBox.getItems().addAll("one", "two","three");

        comboBox.getItems().add("mouth");
        comboBox.getItems().addAll("dck","belly","head");
        comboLabel.setText("");

        radioLabel.setText("");
        //set up a toggle group so that we can't select them all at once
        misToggleGroup = new ToggleGroup();
        this.mis1.setToggleGroup(misToggleGroup);
        this.mis2.setToggleGroup(misToggleGroup);
        this.mis3.setToggleGroup(misToggleGroup);

        listView.getItems().addAll("balls", "tit", "puss", "ass", "make"); // add these items on the list. you can select one by one but not all together
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);  // to be able to select all at once



    }
}
