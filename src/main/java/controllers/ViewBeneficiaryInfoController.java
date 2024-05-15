package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.text.Text;
import users.customers.Beneficiary;

public class ViewBeneficiaryInfoController {
    @FXML private Button returnButton;
    @FXML private Text insuranceCardIDText;
    @FXML private Text beneficiaryIDText;
    @FXML private Text beneficiaryTypeText;
    @FXML private Text beneficiaryNameText;
    @FXML private Text beneficiaryEmailText;
    @FXML private Text beneficiaryPhoneNumberText;
    Beneficiary beneficiary;
    public void setBeneficiaryIDText(Text beneficiaryIDText) {
        this.beneficiaryIDText = beneficiaryIDText;
    }

    public void setBeneficiaryTypeText(Text beneficiaryTypeText) {
        this.beneficiaryTypeText = beneficiaryTypeText;
    }

    public void setBeneficiaryEmailText(Text beneficiaryEmailText) {
        this.beneficiaryEmailText = beneficiaryEmailText;
    }

    public void setBeneficiaryNameText(Text beneficiaryNameText) {
        this.beneficiaryNameText = beneficiaryNameText;
    }

    public void setBeneficiaryPhoneNumberText(Text beneficiaryPhoneNumberText) {
        this.beneficiaryPhoneNumberText = beneficiaryPhoneNumberText;
    }

    public void setInsuranceCardIDText(Text insuranceCardIDText) {
        this.insuranceCardIDText = insuranceCardIDText;
    }
}
