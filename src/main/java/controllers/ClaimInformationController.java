package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

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

    public void setClaimIDText(String claimIDText) {
        this.claimIDText.setText(claimIDText);
    }

    public void setInsuredPersonName(String insuredPersonName) {
        this.insuredPersonName.setText(insuredPersonName);
    }

    public void setInsuredPersonID(String insuredPersonID) {
        this.insuredPersonID.setText(insuredPersonID);
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber.setText(cardNumber);
    }

    public void setClaimAmount(String claimAmount) {
        this.claimAmount.setText(claimAmount);
    }

    public void setExamDate(String examDate) {
        this.examDate.setText(examDate);
    }

    public void setClaimDate(String claimDate) {
        this.claimDate.setText(claimDate);;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
