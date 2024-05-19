/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_owner_controllers;

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
import other_utilities.DateWrapper;
import other_utilities.IDGenerator;
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
    private Dependent dependent;

    private IDGenerator idGenerator;
    private DateWrapper dateWrapper;


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
        dependent = new Dependent();
        dependent.setAddress(address);
        dependent.setEmail(email);
        dependent.setFullName(fullName);
        String dependentID;
        do{
            dependentID = idGenerator.generateCustomerID();
            dependent.setID(dependentID);
        }while (dependentID ==);
        dependent.setPhoneNumber(phoneNumber);
        dependent.setPassword();
    }
    public void completeInsuranceCard(){
        insuranceCard.setCardHolder(dependent);
        insuranceCard.setPolicyOwner();//get current user
    }
    public void completeDependent(){
        dependent.setInsuranceCard(insuranceCard);
    }
    public Dependent saveDependent(ActionEvent event) throws IOException {
        createDependent();
        completeInsuranceCard();
        completeDependent();
        return this.dependent; //save dependent into database
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

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }
}
