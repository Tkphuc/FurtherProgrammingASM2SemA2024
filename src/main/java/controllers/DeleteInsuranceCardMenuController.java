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

import java.io.IOException;

public class DeleteInsuranceCardMenuController {

    @FXML private TextField insuranceCardIDField;
    @FXML private Button confirmButton;

    // Method to switch back to the System Admin Menu
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        // Ensure the correct FXML file name is provided below
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("SystemAdminMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    // Method to retrieve the insurance card ID from the TextField
    public String getInsuranceCardID() {
        return insuranceCardIDField.getText();
    }
}
