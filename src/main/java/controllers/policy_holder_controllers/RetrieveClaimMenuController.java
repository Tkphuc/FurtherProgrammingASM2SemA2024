package controllers.policy_holder_controllers;

import claim.Claim;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import other_utilities.DateWrapper;

import java.io.IOException;

public class RetrieveClaimMenuController {

    @FXML private Text claimIDText;
    @FXML private Text insuredPersonName;
    @FXML private Text insuredPersonID;
    @FXML private Text cardNumber;
    @FXML private Button returnButton;
    @FXML private Text examDate;
    @FXML private Text claimAmount;
    @FXML private Text claimDate;
    @FXML private Text status;
    @FXML private TextField claimIDField;

    Claim claim;
    DateWrapper dateWrapper = new DateWrapper();



    public void setInsuredPersonName(String insuredPersonName) {
        this.insuredPersonName.setText(claim.getInsuredPerson().getFullName());
    }

    public void setInsuredPersonID(String insuredPersonID) {
        this.insuredPersonID.setText(claim.getInsuredPerson().getID());
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber.setText(claim.getCardNumber());
    }

    public void setClaimAmount() {
        this.claimAmount.setText(String.valueOf(claim.getClaimAmount()));
    }

    public void setExamDate() {
        this.examDate.setText(dateWrapper.dateToString(claim.getExamDate()));
    }

    public void setClaimDate(String claimDate) {
        this.claimDate.setText(dateWrapper.dateToString(claim.getClaimDate()));
    }

    public void setClaimID(String claimID) {
        this.claimIDText.setText(claimID);
    }

    public void setStatus() {
        status.setText(claim.getStatus().toString());
    }
    public void setClaim(Claim claim){
        this.claim = claim;
    }
    public void switchToViewBankingInfo(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/R.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
