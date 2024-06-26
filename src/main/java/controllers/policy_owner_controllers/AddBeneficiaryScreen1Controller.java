/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_owner_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import other_utilities.IDGenerator;

import java.io.IOException;

/*https://www.youtube.com/watch?v=hcM-R-YOKkQ*/
public class AddBeneficiaryScreen1Controller {

    @FXML private TextField beneficiaryNameField;
    @FXML private TextField beneficiaryAddress;
    @FXML private TextField beneficiaryEmail;
    @FXML private TextField beneficiaryPhoneNumber;
    @FXML private CheckBox dependentChoice;
    @FXML private CheckBox policyHolderChoice;
    private IDGenerator idGenerator;

    public AddBeneficiaryScreen1Controller() {
    }

    public void switchToAddBeneficiaryScreen2(ActionEvent event) throws IOException {
        FXMLLoader loader = FXMLLoader.load(getClass().getResource("PolicyOwnerFXMLFiles/AddBeneficiaryScreen2.fxml"));
        Parent root = loader.load();
        AddBeneficiaryScreen2Controller addBeneficiaryScreen2Controller = loader.getController();
        addBeneficiaryScreen2Controller.setEmail(getBeneficiaryEmail());
        addBeneficiaryScreen2Controller.setFullName(getBeneficiaryNameField());
        addBeneficiaryScreen2Controller.setAddress(getBeneficiaryAddress());
        addBeneficiaryScreen2Controller.setPhoneNumber(getBeneficiaryPhoneNumber());
        String customerID;
        customerID = idGenerator.generateCustomerID();
        addBeneficiaryScreen2Controller.setBeneficiaryIDText(idGenerator.generateCustomerID());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPolicyOwnerMenu(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerFXMLFiles/PolicyOwnerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
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

    public boolean isDependentSelected() {
        return dependentChoice.isSelected();
    }

    public boolean isPolicyHolderSelected() {
        return policyHolderChoice.isSelected();
    }

}
