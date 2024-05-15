package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.customers.Dependent;

import java.io.IOException;

public class AddDependentBeneficiaryController {

    @FXML private Button saveButton;
    @FXML private Button returnButton;
    @FXML private TextField policyHolderOfDependentField;

    public String getPolicyHolderOfDependentField() {
        return policyHolderOfDependentField.getText();
    }
    public void switchToAddBeneficiaryScreen2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public Dependent createDependent(){
        Dependent dependent = new Dependent();
        dependent.setAddress();
        dependent.setEmail();
        dependent.setFullName();
        dependent.setID();
        dependent.setPhoneNumber();
        dependent.setPassword();
    }
}
