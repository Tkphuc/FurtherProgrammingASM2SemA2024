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
import users.customers.PolicyHolder;

import java.io.IOException;

public class UpdatePolicyHolderInfoController {
    @FXML private TextField newPasswordField;
    @FXML private TextField newAddressField;
    @FXML private TextField newPhoneNumberField;
    @FXML private TextField newEmailField;
    @FXML private Text currentAddress;
    @FXML private Text currentPhoneNumber;
    @FXML private Text currentEmail;
    @FXML private Text currentPasswordText;
    @FXML
    private Stage stage;
    @FXML private Scene scene;
    private PolicyHolder policyHolder;
    public void switchToPolicyHolderMenuController(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void setCurrentAddress(){
        currentAddress.setText(policyHolder.getAddress());
    }
    public void setCurrentPhoneNumber(){
        currentPhoneNumber.setText(policyHolder.getPhoneNumber());
    }
    public void setCurrentEmail(){
        currentEmail.setText(policyHolder.getEmail());
    }
    public void setCurrentPassword(){currentPasswordText.setText(policyHolder.getPassword());}
    public String getNewAddress(){
        return newAddressField.getText();
    }
    public String getNewPhoneNumber(){
        return newPhoneNumberField.getText();
    }
    public String getNewEmail(){
        return newEmailField.getText();
    }
    public String getNewPassword(){return newPasswordField.getText();}
    public void updatePolicyHolder(){

    }

}
