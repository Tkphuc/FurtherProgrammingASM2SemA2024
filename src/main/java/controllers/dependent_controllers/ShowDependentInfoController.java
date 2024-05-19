/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.dependent_controllers;

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
import users.customers.Dependent;

import java.io.IOException;

public class ShowDependentInfoController {
    @FXML private
    Text PolicyHolderIDText;
    @FXML private  Text addressText;
    @FXML private  Text nameText;
    @FXML private  Text phoneNumberText;
    @FXML private  Text emailText;
    private Dependent dependent;

    public void setPolicyHolderIDText() {
        PolicyHolderIDText.setText(dependent.getDependOn().getID());
    }

    public void setAddressText() {
        this.addressText.setText(dependent.getAddress());
    }

    public void setPhoneNumberText() {
        this.phoneNumberText.setText(dependent.getPhoneNumber());
    }

    public void setEmailText() {
        this.emailText.setText(dependent.getEmail());
    }

    public void setNameText() {
        this.nameText.setText(dependent.getFullName());
    }

    public void setDependent(Dependent dependent) {
        this.dependent = dependent;
    }
    public void switchToDependentMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DependentFXMLFiles/DependentMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
