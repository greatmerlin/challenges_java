package FFHS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text actiontarget;
    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {

        actiontarget.setText("Sign in button pressed");
    }
}
