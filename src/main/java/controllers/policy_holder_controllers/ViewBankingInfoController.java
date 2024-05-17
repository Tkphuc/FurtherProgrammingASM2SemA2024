package controllers.policy_holder_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewBankingInfoController {
   @FXML private Text bankName;
    @FXML private Text receiverName;
    @FXML private Text accountNumber;

    public void setBankName(Text bankName) {
        this.bankName = bankName;
    }

    public void setReceiverName(Text receiverName) {
        this.receiverName = receiverName;
    }

    public void setAccountNumber(Text accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void switchToRetrieveClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/RetrieveClaimMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }public void switchToShowDocument(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/ShowDocuments.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
