package controllers.policy_owner_controllers;

import insurance_card.InsuranceCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import other_utilities.DateWrapper;
import other_utilities.IDGenerator;
import users.customers.Dependent;
import users.customers.PolicyHolder;

import java.io.IOException;

public class AddBeneficiaryScreen2Controller {
    @FXML private TextField cardIDField;
    @FXML private TextField expirationDateField;
    @FXML private Text beneficiaryIDText;
    @FXML private Text beneficiaryTypeText;
    private IDGenerator idGenerator;
    private DateWrapper dateWrapper;
    private PolicyHolder policyHolder;
    private Dependent dependent;
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

    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PolicyOwnerFXMLFiles/AddBeneficiaryScreen1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAddNextScenceOrSave(ActionEvent event) throws IOException {
        if(beneficiaryTypeText.getText().equalsIgnoreCase("Dependent")){
            FXMLLoader loader = FXMLLoader.load(getClass().getResource("PolicyOwnerFXMLFiles/AddBeneficiaryDependent.fxml"));
            Parent root = loader.load();
            AddDependentBeneficiaryController addDependentBeneficiaryController = loader.getController();
            addDependentBeneficiaryController.setAddress(this.address);
            addDependentBeneficiaryController.setFullName(this.fullName);
            addDependentBeneficiaryController.setEmail(this.email);
            addDependentBeneficiaryController.setPhoneNumber(this.phoneNumber);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
        else{
            createPolicyHolder();
        }
    }
    public void createPolicyHolder(){
        this.policyHolder.setAddress(address);
        this.policyHolder.setEmail(email);
        this.policyHolder.setFullName(fullName);
         this.policyHolder.setPhoneNumber(phoneNumber);
        this.policyHolder.setPassword();
    }
    public void completePolicyHolder(){
        policyHolder.setInsuranceCard(createInsuranceCard());
        return policyHolder;
    }
    public InsuranceCard completeInsuranceCard(){
        InsuranceCard insuranceCard = createInsuranceCard();
        insuranceCard.setCardHolder(completePolicyHolder());
        insuranceCard.setPolicyOwner();//get current user
        return insuranceCard;
    }
    public InsuranceCard createInsuranceCard(){
        InsuranceCard insuranceCard = new InsuranceCard();
        insuranceCard.setExpirationDate(dateWrapper.dateCreate(getExpirationDate()));
        String cardID;
        do{
            cardID = idGenerator.generateCardID();
            insuranceCard.setCardID(cardID);}
        while (cardID ==);
        return insuranceCard;}
    }






}
