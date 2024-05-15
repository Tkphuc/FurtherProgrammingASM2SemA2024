package controllers;

import claim.Claim;
import claim.ReceiverBankingInfo;
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

public class FileReceiverBankingInfoController {
    @FXML private TextField bankNameField;
    @FXML private  TextField receiverNameField;
    @FXML private  TextField accountNumberField;
    @FXML private  Button returnButton;
    @FXML private  Button saveButton;
    private Claim newClaim;
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FileClaim.fxml"));
        Stage   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public String getReceiverName() {
        return receiverNameField.getText();
    }

    public String getAccountNumber() {
        return accountNumberField.getText();
    }

    public String getBankName() {
        return bankNameField.getText();
    }
    public ReceiverBankingInfo createBankingInfo(){
        ReceiverBankingInfo receiverBankingInfo  = new ReceiverBankingInfo();
        receiverBankingInfo.setBank(getBankName());
        receiverBankingInfo.setName(getReceiverName());
        receiverBankingInfo.setNumber(getAccountNumber());
        return receiverBankingInfo;
    }
    public void setClaimBankingInfo(){
       this.newClaim.setReceiverBankingInfo(createBankingInfo());
    }
    public void setNewClaim(Claim newClaim) {
        this.newClaim = newClaim;
    }
    public Claim saveNeClaim(){
        setClaimBankingInfo();
        return this.newClaim;
    }

}
