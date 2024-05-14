package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/*https://www.youtube.com/watch?v=hcM-R-YOKkQ*/
public class addBeneficiaryController {

    @FXML private TextField cardIDField;
    @FXML private Button returnButtonScreen1;
    @FXML private Button nextButtonScreen1;
    @FXML private TextField expirationDateField;
    @FXML private TextField beneficiaryTypeField;
    @FXML private TextField beneficiaryNameField;
    @FXML private TextField beneficiaryAddress;
    @FXML private TextField beneficiaryEmail;
    @FXML private TextField beneficiaryPhoneNumber;
    @FXML private CheckBox dependentChoice;
    @FXML private CheckBox policyHolderChoice;
    @FXML private Text beneficiaryIDText;
    @FXML private Text beneficiaryTypeText;

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

    public boolean isDependentSelected() {
        return dependentChoice.isSelected();
    }

    public boolean isPolicyHolderSelected() {
        return policyHolderChoice.isSelected();
    }

    public void setBeneficiaryIDText(String beneficiaryIDText) {
        this.beneficiaryIDText.setText(beneficiaryIDText);
    }

    public void setBeneficiaryTypeText(String beneficiaryTypeText) {
        this.beneficiaryTypeText.setText(beneficiaryTypeText);
    }
}
