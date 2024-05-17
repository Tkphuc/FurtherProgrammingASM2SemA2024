package controllers.policy_owner_controllers.beneficiary_controllers;

import insurance_card.InsuranceCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.customers.Dependent;

import java.io.IOException;

public class AddDependentBeneficiaryController {

    @FXML private Button saveButton;
    @FXML private Button returnButton;
    @FXML private TextField policyHolderOfDependentField;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String email;
    InsuranceCard insuranceCard;
    public String getPolicyHolderOfDependentField() {
        return policyHolderOfDependentField.getText();
    }
    public void switchToAddBeneficiaryScreen2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PolicyOwnerFXMLFiles/AddBeneficiaryScreen2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public Dependent createDependent(){
        Dependent dependent = new Dependent();
        dependent.setAddress(address);
        dependent.setEmail(email);
        dependent.setFullName(fullName);
        dependent.setID();
        dependent.setPhoneNumber(phoneNumber);
        dependent.setPassword();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
