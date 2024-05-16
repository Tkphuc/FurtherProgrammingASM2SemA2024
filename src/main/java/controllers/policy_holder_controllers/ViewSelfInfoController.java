package controllers.policy_holder_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewSelfInfoController {
    @FXML private Text IDText;
    @FXML private Text nameText;
    @FXML private Text addressText;
    @FXML private Text emailText;
    @FXML private Text phoneNumberText;

    public void setIDText(String IDText) {
        this.IDText.setText(IDText);
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
    public void switchToPolicyOwnerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
