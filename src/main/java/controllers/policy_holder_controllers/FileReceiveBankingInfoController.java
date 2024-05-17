package controllers.policy_holder_controllers;

import claim.ReceiverBankingInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FileReceiveBankingInfoController {
    @FXML private TextField bankNameField;
    @FXML private TextField receiverNameField;
    @FXML private TextField accountNumberField;

    public String getBankName() {
        return bankNameField.getText();
    }

    public String getReceiverName() {
        return receiverNameField.getText();
    }

    public String getAccountNumber() {
        return accountNumberField.getText();
    }
    public ReceiverBankingInfo createBankingInfo(){
        ReceiverBankingInfo receiverBankingInfo  = new ReceiverBankingInfo();
        receiverBankingInfo.setBank(getBankName());
        receiverBankingInfo.setName(getReceiverName());
        receiverBankingInfo.setNumber(getAccountNumber());
        return receiverBankingInfo;
    }
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/FileReceiverBankingInfo.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}