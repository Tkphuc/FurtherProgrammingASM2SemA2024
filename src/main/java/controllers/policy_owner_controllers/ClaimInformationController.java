package controllers.policy_owner_controllers;

import claim.Claim;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import other_utilities.DateWrapper;

import java.io.IOException;

public class ClaimInformationController {
    @FXML private Text claimIDText;
    @FXML private Text insuredPersonName;
    @FXML private Text insuredPersonID;
    @FXML private Text cardNumber;
    @FXML private Button returnButton;
    @FXML private Text claimAmount;
    @FXML private Text examDate;
    @FXML private Text claimDate;
    @FXML private Text status;
     Claim claim;
     DateWrapper dateWrapper = new DateWrapper();

    public void setClaimIDText() {
        this.claimIDText.setText(claim.getClaimID());
    }

    public void setInsuredPersonName() {
        this.insuredPersonName.setText(claim.getInsuredPerson().getFullName());
    }

    public void setInsuredPersonID() {
        this.insuredPersonID.setText(claim.getInsuredPerson().getID());
    }

    public void setCardNumber() {
        this.cardNumber.setText(claim.getCardNumber());
    }

    public void setClaimAmount() {
        this.claimAmount.setText(String.valueOf(claim.getClaimAmount()));
    }

    public void setExamDate() {
        this.examDate.setText(dateWrapper.dateToString(claim.getExamDate()));
    }

    public void setClaimDate() {
        this.claimDate.setText(dateWrapper.dateToString(claim.getClaimDate()));
    }

    public void setStatus() {
        status.setText(claim.getStatus().toString());
    }
    public void setClaim(Claim claim){
        this.claim = claim;
    }
    public void initalize(){
        setCardNumber();
        setClaimAmount();
        setClaimDate();
        setClaimDate();
        setClaimIDText();
        setInsuredPersonName();
        setInsuredPersonID();
        setExamDate();
        setStatus();
    } public void switchToRetrieveBeneficiaryClain(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent parent = loader.load(getClass().getResource("PolicyOwnerFXMLFiles/RetrieveBeneficiaryCaimMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToViewBankingInfo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyOwnerFXMLFiles/ViewBankingInfo.fxml"));
        ViewBankingInfoController viewBankingInfoController = loader.getController();
        viewBankingInfoController.setClaim(this.claim);
        viewBankingInfoController.initalize();
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
