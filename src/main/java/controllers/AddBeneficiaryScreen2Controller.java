package controllers;

import insurance_card.InsuranceCard;
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
import users.customers.PolicyHolder;

import java.io.IOException;

public class AddBeneficiaryScreen2Controller {
    @FXML private TextField cardIDField;
    @FXML private TextField expirationDateField;
    @FXML private Text beneficiaryIDText;
    @FXML private Text beneficiaryTypeText;
    String fullName;
    String phoneNumber;
    String address;
    String email;

    public void setBeneficiaryTypeText(String beneficiaryTypeText) {
        this.beneficiaryTypeText.setText(beneficiaryTypeText);
    }

    public void setBeneficiaryIDText(String beneficiaryIDText) {
        this.beneficiaryIDText.setText(beneficiaryIDText);
    }

    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAddNextScenceOrSave(ActionEvent event) throws IOException {
        if(beneficiaryTypeText.getText().equalsIgnoreCase("Dependent")){
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryDependent.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
        else{

        }
    }

    public String getBeneficiaryIDText() {
        return beneficiaryIDText.getText();
    }

    public String getBeneficiaryTypeText() {
        return beneficiaryTypeText.getText();
    }

    public String getCardID() {
        return cardIDField.getText();
    }
    public String getExpirationDate() {
        return expirationDateField.getText();
    }
    public PolicyHolder createPolicyHolder(){
        PolicyHolder policyHolder = new PolicyHolder();
        policyHolder.setAddress(address);
        policyHolder.setEmail(email);
        policyHolder.setFullName(fullName);
        policyHolder.setPhoneNumber(phoneNumber);
        policyHolder.setPassword();
        return policyHolder;
    }
    public InsuranceCard createInsuranceCard(){
        InsuranceCard insuranceCard = new InsuranceCard();
        insuranceCard.setExpirationDate();
        insuranceCard.setCardID();
        return insuranceCard;
    }
    public PolicyHolder completePolicyHolder(){
        PolicyHolder policyHolder = createPolicyHolder();
        policyHolder.setInsuranceCard(createInsuranceCard());
        return policyHolder;
    }
    public InsuranceCard completeInsuranceCard(){
        InsuranceCard insuranceCard = createInsuranceCard();
        insuranceCard.setCardHolder(completePolicyHolder());
        insuranceCard.setPolicyOwner();
        return insuranceCard;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
