package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    private String[] customerTypes = {"Policy Owner","Policy Holder","Dependent"};
    private String chosenType;
    @FXML public String getCustomerName(){return customerNameField.getText();}
    @FXML public String getCustomerPassword(){return customerPasswordField.getText();}
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(policyOwnerChoice.isSelected()){
                chosenType = customerTypes[0];
            } else if (policyHolderChoice.isSelected()) {
                chosenType = customerTypes[1];
            } else if (dependentChoice.isSelected()) {
                chosenType = customerTypes[2];
            }else {}
        }
    };
    public void switchToAddBeneficiaryScreen(ActionEvent event) throws IOException {
        FXMLLoader loader =new FXMLLoader();
        Parent parent = loader.load(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNextStep(ActionEvent event){
        AddBeneficiaryScreen1Controller addBeneficiaryScreen1Controller = new AddBeneficiaryScreen1Controller();
        if(chosenType.equalsIgnoreCase(customerTypes[0])){
            customerFactory.createCustomer(chosenType);
        } else if (chosenType.equalsIgnoreCase(customerTypes[1])) {
            addBeneficiaryScreen1Controller.
        } else if (chosenType.equalsIgnoreCase(customerTypes[2])) {
            switchToAddBeneficiaryScreen();
        }
    }
    

}
