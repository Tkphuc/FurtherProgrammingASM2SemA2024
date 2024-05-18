package controllers.policy_owner_controllers;

import claim.Claim;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import other_utilities.DateWrapper;

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
    }
}
