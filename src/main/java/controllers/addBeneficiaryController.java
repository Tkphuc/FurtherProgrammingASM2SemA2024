package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/*https://www.youtube.com/watch?v=hcM-R-YOKkQ*/
public class addBeneficiaryController {
    public TextField cardIDField;
    public Button returnButtonScreen1;
    public Button nextButtonScreen1;
    public TextField expirationDateField;
    public TextField beneficiaryTypeField;
    public TextField beneficiaryNameField;
    public TextField beneficiaryAddress;
    public TextField beneficiaryEmail;
    public TextField beneficiaryPhoneNumber;
    private Stage stage;
    private Scene scene;
    private Parent root;


    public addBeneficiaryController() {
    }

    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAddBeneficiaryScreen2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPolicyOwnerMenu(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public String getExpirationDate() {
        return expirationDateField.getText();
    }

    public String getBeneficiaryTypeField() {
        return beneficiaryTypeField.getText();
    }

    public String getBeneficiaryNameField() {
        return beneficiaryNameField.getText();
    }

    public String getBeneficiaryAddress() {
        return beneficiaryAddress.getText();
    }

    public String getBeneficiaryEmail() {
        return beneficiaryEmail.getText();
    }

    public String getBeneficiaryPhoneNumber() {
        return beneficiaryPhoneNumber.getText();
    }

    public String getCardIDField() {
        return cardIDField.getText();
    }
}
