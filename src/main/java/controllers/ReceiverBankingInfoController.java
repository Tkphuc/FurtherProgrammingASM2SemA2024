package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceiverBankingInfoController {
    @FXML private TextField bankNameField;
    @FXML private  TextField receiverNameField;
    @FXML private  TextField accountNumberField;
    @FXML private  Button returnButton;
    @FXML private  Button exitButton;
    @FXML
    private Stage stage;
    @FXML private Scene scene;
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FileClaim.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public String getReceiverName() {
        return receiverNameField.getText();
    }

    public String getAccountNumberField() {
        return accountNumberField.getText();
    }

    public String getBankNameField() {
        return bankNameField.getText();
    }
}
