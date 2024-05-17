package controllers.policy_owner_controllers.beneficiary_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import users.customers.Beneficiary;

import java.io.IOException;

public class ViewBeneficiaryInfoController {
    @FXML private Button returnButton;
    @FXML private Text insuranceCardIDText;
    @FXML private Text beneficiaryIDText;
    @FXML private Text beneficiaryTypeText;
    @FXML private Text beneficiaryNameText;
    @FXML private Text beneficiaryEmailText;
    @FXML private Text beneficiaryPhoneNumberText;
    Beneficiary beneficiary;
    public void switchPolicyOwnerMenu(ActionEvent event) throws IOException {
        // Correct FXML file should be loaded, replace "PolicyHolderMenu.fxml" if that's not correct
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyOwnerFXMLFiles/PolicyOwnerMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
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
