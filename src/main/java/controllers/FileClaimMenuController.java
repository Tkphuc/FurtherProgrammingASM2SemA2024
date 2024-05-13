package controllers;

import claim.Claim;
import claim.ClaimBuilder;
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
import java.util.Date;

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
        Parent parent = FXMLLoader.load(getClass().getResource("ViewBanking.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchPolicyOwnerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
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
    public boolean checkID(String customerID){
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

}
