package com.theo;

import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.List;

public class Programm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final List<Person> persons = createPersons();
        final ObservableList<Person> entries = FXCollections.observableArrayList(persons);

        final TableView<Person> tableView = createTableView(entries);

        final VBox root = new VBox(7,tableView);
        root.setPadding(new Insets(7));

        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.setTitle("Aufgabe_TableView");
        primaryStage.show();
    }

    public TableView<Person> createTableView(final ObservableList<Person> data) {

        final TableView<Person> tableView = new TableView<>(); // create the table

        final TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
        final TableColumn<Person, String> vornameColumn = new TableColumn<>("Vorname");
        final TableColumn<Person, Integer> ageColumn = new TableColumn<>("Alter");

        tableView.getColumns().addAll(nameColumn,vornameColumn,ageColumn); // add the columns to the table

        // connection based on Strings

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        vornameColumn.setCellValueFactory(new PropertyValueFactory<>("vorname"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("alter"));      //the bug was here -> "age" anstatt "alter"

        tableView.setItems(data);
        return tableView;
    }

    private List<Person> createPersons() {

        final Person theo = new Person("Theo", "Bax", 27);
        final Person christina = new Person("Christina", "Para", 26);
        final Person john = new Person("John", "Muster", 30);
        final Person mary = new Person ("Mary", "MusterTwo", 25);

        return Arrays.asList(theo,christina,john,mary);
    }
}
