/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.system_admin_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteCustomerMenuController {

    @FXML private TextField customerIDField;
    @FXML private Button confirmButton;

    // Method to switch back to the System Admin Menu
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        // Correct FXML file should be loaded, replace "PolicyHolderMenu.fxml" if that's not correct
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("SystemAdminFXMLFiles/SystemAdminMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    // Method to retrieve the customer ID from the TextField
    public String getCustomerID() {
        return this.customerIDField.getText();
    }
}
