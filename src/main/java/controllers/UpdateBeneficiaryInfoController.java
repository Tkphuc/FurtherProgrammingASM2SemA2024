package controllers;

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

import java.io.IOException;

public class UpdateBeneficiaryInfoController {

    @FXML private TextField newAddressField;
    @FXML private TextField newPhoneNumberField;
    @FXML private TextField newEmailField;
    @FXML private Button saveButton;
    @FXML private Button returnButton;
    @FXML private Text currentAddress;
    @FXML private Text currentPhoneNumber;
    @FXML private Text currentEmail;

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress.setText(currentAddress);}

    public void setCurrentPhoneNumber(String currentPhoneNumber) {
        this.currentPhoneNumber.setText(currentPhoneNumber);}

    public void setCurrentEmail(String currentEmail) {
        this.currentEmail.setText(currentEmail);}

    public String  getNewAddressField() {
        return newAddressField.getText();
    }

    public  String getNewPhoneNumberField() {
        return newPhoneNumberField.getText();
    }

    public String getNewEmailField() {
        return newEmailField.getText();
    }
    /*
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }*/

}
