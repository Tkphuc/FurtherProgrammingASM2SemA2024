package controllers.policy_holder_controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class UpdateClaimMenuController {
    @FXML private TextField newExamDateField;
    @FXML private TextField newClaimDateField;
    @FXML private TextField newReceiverNameField;
    @FXML private TextField newReceiverBankField;
    @FXML private TextField newReceiverAccountNumberField;

    @FXML private Text claimIDText;
    @FXML private Text currentExamDate;
    @FXML private Text currentClaimIDText;
    @FXML private Text currentReceiverNameText;
    @FXML private Text currentReceiverBankText;
    @FXML private Text currentReceiverAccountNumber;

    public void setClaimIDText(String claimIDText) {
        this.claimIDText.setText(claimIDText);
    }

    public void setCurrentExamDateField(String currentExamDateField) {
        this.currentExamDate.setText(currentExamDateField);
    }

    public void setCurrentClaimIDText(String currentClaimIDText) {
        this.currentClaimIDText.setText(currentClaimIDText);
    }

    public void setCurrentReceiverNameText(String currentReceiverNameText) {
        this.currentReceiverNameText.setText(currentReceiverNameText);
    }

    public void setCurrentReceiverBankText(String currentReceiverBankText) {
        this.currentReceiverBankText.setText(currentReceiverBankText);
    }

    public void setCurrentReceiverAccountNumber(String currentReceiverAccountNumber) {
        this.currentReceiverAccountNumber.setText(currentReceiverAccountNumber);
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
}
