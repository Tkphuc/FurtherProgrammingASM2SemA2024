package controllers.policy_holder_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import users.customers.Dependent;

import java.io.IOException;

public class UpdateDependentInfoController {
    @FXML private TextField dependentIDField;
    @FXML private TextField newEmailField;
    @FXML private TextField newAddressField;
    @FXML private TextField newPhoneNumberField;
    @FXML private TextField newPasswordField;
    @FXML private Text currentPhoneNumberText;
    @FXML private Text currentAddressText;
    @FXML private Text currentEmailText;
    @FXML private Text currentPasswordText;
    private Dependent dependent;
    public String getDependentIDField() {
        return dependentIDField.getText();
    }

    public String getNewEmailField() {
        return newEmailField.getText();
    }

    public String getNewAddressField() {
        return newAddressField.getText();
    }

    public String getNewPhoneNumberField() {
        return newPhoneNumberField.getText();
    }

    public String getNewPasswordField() {
        return newPasswordField.getText();
    }

    public void setCurrentPhoneNumberText(String currentPhoneNumberText) {
        this.currentPhoneNumberText.setText(currentPhoneNumberText);
    }

    public void setCurrentAddressText(String currentAddressText) {
        this.currentAddressText.setText(currentAddressText);
    }

    public void setCurrentEmailText(String currentEmailText) {
        this.currentEmailText.setText(currentEmailText);
    }

    public void setCurrentPasswordText(String currentPasswordText) {
        this.currentPasswordText.setText(currentPasswordText);
    }

    public void switchToPolicyHolderMenuController(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public Dependent getDependent() {
        return dependent;
    }

    public void setDependent(Dependent dependent) {
        this.dependent = dependent;
    }
}
