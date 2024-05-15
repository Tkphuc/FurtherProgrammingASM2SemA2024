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

public class AddBeneficiaryScreen2Controller {
    @FXML private TextField cardIDField;
    @FXML private TextField expirationDateField;
    @FXML private Text beneficiaryIDText;
    @FXML private Text beneficiaryTypeText;

    public void setBeneficiaryTypeText(String beneficiaryTypeText) {
        this.beneficiaryTypeText.setText(beneficiaryTypeText);
    }

    public void setBeneficiaryIDText(String beneficiaryIDText) {
        this.beneficiaryIDText.setText(beneficiaryIDText);
    }

    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAddNextScenceOrSave(ActionEvent event) throws IOException {
        if(beneficiaryTypeText.getText().equalsIgnoreCase("Dependent")){
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryDependent.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}
        else{

        }
    }

    public String getBeneficiaryIDText() {
        return beneficiaryIDText.getText();
    }

    public String getBeneficiaryTypeText() {
        return beneficiaryTypeText.getText();
    }

    public String getCardID() {
        return cardIDField.getText();
    }
    public String getExpirationDate() {
        return expirationDateField.getText();
    }


}
