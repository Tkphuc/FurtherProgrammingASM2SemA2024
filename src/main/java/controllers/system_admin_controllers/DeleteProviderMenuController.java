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

public class DeleteProviderMenuController {

    @FXML private Button confirmButton;
    @FXML private TextField providerIDField;

    // Method to switch back to the System Admin Menu
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("SystemAdminFXMLFiles/SystemAdminMenu.fxml"));
        Parent parent = loader.load();// Ensure the FXML file name is correct
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    // Method to retrieve the provider ID from the TextField
    public String getProviderID() {
        return providerIDField.getText();
    }
}
