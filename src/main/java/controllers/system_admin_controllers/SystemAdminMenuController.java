package controllers.system_admin_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SystemAdminMenuController {

    public Button updateInsuranceCardButton;
    @FXML private Button addCustomerButton;
    @FXML private Button updateUserButton;
    @FXML private Button exitButton;
    @FXML private Button retrieveAllClaims;
    @FXML private Button addProviderButton;

    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToUpdateCustomerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/UpdateCustomerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToAddProviderMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/AddProviderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToAddCustomerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/AddCustomerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateInsuranceCardMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/UpdateInsuranceCardMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateProviderMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/UpdateProviderInfo.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAddInsuranceCardMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/AddInsuranceCardMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDeleteCustomerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/DeleteCustomerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDeleteProviderMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/DeleteProviderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDeleteInsuranceCardMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/DeleteInsuranceCardMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }







}
