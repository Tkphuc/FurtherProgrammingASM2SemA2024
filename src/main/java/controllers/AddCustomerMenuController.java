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
import javafx.stage.Stage;

import users.customers.customerFactory;

import java.io.IOException;

public class AddCustomerMenuController {

    @FXML private CheckBox policyOwnerChoice;
    @FXML private CheckBox policyHolderChoice;
    @FXML private CheckBox dependentChoice;
    @FXML private Button returnButton;
    @FXML private Button nextButton;
    @FXML private TextField customerNameField;
    @FXML private TextField customerPasswordField;
    private String[] customerTypes = {"Policy Owner", "Policy Holder", "Dependent"};
    private String chosenType;
    private customerFactory CustomerFactory;

    @FXML
    public String getCustomerName() {
        return customerNameField.getText();
    }

    @FXML
    public String getCustomerPassword() {
        return customerPasswordField.getText();
    }

    @FXML
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToNextStep(ActionEvent event) throws IOException {
        determineChosenType();
        if (chosenType != null) {
            switch (chosenType) {
                case "Policy Owner":
                    CustomerFactory.createCustomer(chosenType);
                    switchToSystemAdminMenu(event);
                    break;
                case "Policy Holder":
                    // Assuming some specific functionality needed for "Policy Holder"
                    break;
                case "Dependent":
                    switchToAddBeneficiaryScreen(event);
                    break;
                default:
                    break;
            }
        }
    }

    private void determineChosenType() {
        if (policyOwnerChoice.isSelected()) {
            chosenType = customerTypes[0];
        } else if (policyHolderChoice.isSelected()) {
            chosenType = customerTypes[1];
        } else if (dependentChoice.isSelected()) {
            chosenType = customerTypes[2];
        } else {
            chosenType = null;
        }
    }

    @FXML
    public void switchToAddBeneficiaryScreen(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
