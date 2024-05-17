package controllers.policy_holder_controllers;

import claim.Claim;
import claim.Status;
import controllers.policy_owner_controllers.calim_controllers.FileReceiverBankingInfoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import other_utilities.FormatCheck;
import other_utilities.DateWrapper;

import java.io.IOException;

public class FileClaimController {

    @FXML private TextField claimAmountField;
    @FXML private TextField examDateField;
    @FXML private TextField claimDateField;
    @FXML private TextField customerIDField;
    @FXML private TextField documentField;
    private FormatCheck formatCheck;
    private DateWrapper dateWrapper;
    private Claim newClaim;

    public Double getClaimAmount() {
        return Double.parseDouble(claimAmountField.getText());
    }
    public String getExamDate() {
        return examDateField.getText();
    }
    public String getClaimDate() {
        return claimDateField.getText();
    }
    public String getCustomerID() {
        return customerIDField.getText();
    }
    public String getDocument() {
        return documentField.getText();
    }
    public void switchToBankingInfoMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/FileReceiverBankingInfo.fxml"));
        FileReceiverBankingInfoController receiverBankingInfoController = loader.getController();
        receiverBankingInfoController.setClaimBankingInfo(createNewClaim());

        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchPolicyHolderMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public boolean checkID(){
        if(formatCheck.customerIDCheck(getCustomerID())!= null){
            return true;
        }else {return false;}
    }
    public boolean checkDate(String date){
        if(dateWrapper.dateCreate(date) == null){
            return false;
        } else  {
            return true;
        }
    }
    public boolean checkDocument(String document){
        if (formatCheck.documentNameCheck(document) != null){
            return true;
        }else {return false;}
    }

    public void setNewClaim(Claim newClaim) {
        this.newClaim = newClaim;
    }

    private Claim createNewClaim(){
        if(checkID()){
            newClaim.setInsuredPerson();//get insured person from database
            newClaim.setCardNumber();//get card number from customer
        }
        if(checkDate(getClaimDate())){
            newClaim.setClaimDate(dateWrapper.dateCreate(getClaimDate()));
        }
        if(checkDate(getExamDate())){
            newClaim.setExamDate(dateWrapper.dateCreate(getExamDate()));
        }
        if(checkDocument(getDocument())){
            newClaim.addDocument(getDocument());
        }
        newClaim.setStatus(Status.NEW);
        return newClaim;
    }
}
