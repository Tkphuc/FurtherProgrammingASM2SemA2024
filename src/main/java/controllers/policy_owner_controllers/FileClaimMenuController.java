package controllers.policy_owner_controllers;

import claim.Claim;
import claim.ClaimBuilder;
import claim.Status;
import controllers.FileReceiverBankingInfoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import other_utilities.DateWrapper;
import other_utilities.FormatCheck;

import java.io.IOException;

public class FileClaimMenuController {
    @FXML
    private TextField claimAmountField;
    @FXML
    private TextField examDateField;
    @FXML
    private TextField claimDateField;
    @FXML
    private TextField customerIDField;
    @FXML
    private TextField documentField;
    @FXML
    private Scene scene;
    @FXML private Stage stage;
    private DateWrapper dateWrapper;
    private FormatCheck formatCheck;
    private Claim newClaim;
    private ClaimBuilder claimBuilder;

    public FileClaimMenuController() {
    }

    public void switchToBankingInfoMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyOwnerFXMLFiles/FileReceiverBankingInfo.fxml"));
        FileReceiverBankingInfoController receiverBankingInfoController = loader.getController();
        receiverBankingInfoController.setNewClaim(createNewClaim());

        Parent parent = loader.load();
        Stage  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchPolicyOwnerMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyOwnerFXMLFiles/PolicyOwnerMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

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
    private Claim createNewClaim(){
        if(checkID()){
            newClaim.setInsuredPerson();
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
