package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    @FXML
    public void buttonClick(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
