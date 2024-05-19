/*
 * *
 *  * @author <Team 31>
 *
 */

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

public class ViewDependentInfo {
    @FXML private TextField beneficiaryIDField;
    @FXML
    private Text PolicyHolderIDText;
    @FXML private Text nameText;
    @FXML private Text addressText;
    @FXML private Text emailText;
    @FXML private Text phoneNumberText;
    private Dependent dependent;
    public void setPolicyHolderIDText(String policyHolderIDText) {
        this.PolicyHolderIDText.setText(policyHolderIDText);
    }

    public void setNameText(String nameText) {
        this.nameText.setText(nameText);
    }

    public void setAddressText(String addressText) {
        this.addressText.setText(addressText);
    }

    public void setPhoneNumberText(String phoneNumberText) {
        this.phoneNumberText.setText(phoneNumberText);
    }

    public void setEmailText(String emailText) {
        this.emailText.setText(emailText);
    }

    public String getBeneficiaryIDField() {
        return beneficiaryIDField.getText();
    }

    public Dependent getDependent() {
        return dependent;
    }

    public void setDependent(Dependent dependent) {
        this.dependent = dependent;
    }

    public void switchToPolicyOwnerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
