package controllers.policy_holder_controllers;

import claim.Claim;
import claim.ReceiverBankingInfo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import other_utilities.DateWrapper;

public class UpdateClaimMenuController {
    ;
    @FXML private TextField newExamDateField;
    @FXML private TextField newClaimDateField;
    @FXML private TextField newReceiverNameField;
    @FXML private TextField newReceiverBankField;
    @FXML private TextField newReceiverAccountNumberField;


    @FXML private Text claimIDText;
    @FXML private Text currentExamDate;
    @FXML private Text currentClaimDateText;
    @FXML private Text currentReceiverNameText;
    @FXML private Text currentReceiverBankText;
    @FXML private Text currentReceiverAccountNumber;

    private DateWrapper dateWrapper;

    private Claim claim;

    public void setClaimIDText() {
        this.claimIDText.setText(claim.getClaimID());
    }

    public void setCurrentClaimDateText(){
        this.currentClaimDateText.setText(dateWrapper.dateToString(claim.getClaimDate()));
    }
    public void setCurrentExamDate() {
        this.currentExamDate.setText(dateWrapper.dateToString(claim.getExamDate()));
    }

    public void setCurrentReceiverNameText() {
        this.currentReceiverNameText.setText(claim.getReceiverBankingInfo().getName());
    }

    public void setCurrentReceiverBankText() {
        this.currentReceiverBankText.setText(claim.getReceiverBankingInfo().getBank());
    }

    public void setCurrentReceiverAccountNumber() {
        this.currentReceiverAccountNumber.setText(claim.getReceiverBankingInfo().getNumber());
    }

    public String getNewExamDateField() {
        return newExamDateField.getText();
    }

    public String getNewClaimDateField() {
        return newClaimDateField.getText();
    }

    public String getNewReceiverNameField() {
        return newReceiverNameField.getText();
    }

    public String getNewReceiverBankField() {
        return newReceiverBankField.getText();
    }

    public String getNewReceiverAccountNumberField() {
        return newReceiverAccountNumberField.getText();
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }
    public void initalize(){
        setClaimIDText();
        setCurrentExamDate();
        setCurrentReceiverNameText();
        setCurrentReceiverBankText();
        setCurrentReceiverAccountNumber();
        setCurrentClaimDateText();
    }
    public void updateClaim(){
        claim.setExamDate(dateWrapper.dateCreate(getNewExamDateField()));
        ReceiverBankingInfo newBankingInfo = new ReceiverBankingInfo(getNewReceiverBankField(),getNewReceiverNameField(),getNewReceiverAccountNumberField());
        claim.setReceiverBankingInfo(newBankingInfo);
        claim.setClaimDate(dateWrapper.dateCreate(getNewClaimDateField()));
    }
    /*save new claim*/
}
