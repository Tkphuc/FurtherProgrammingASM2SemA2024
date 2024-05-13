package controllers;

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
    public void switchToUpdateUserMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("UpdateUserInfo.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToAddProviderMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AddProviderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToAddCustomerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AddCustomerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateInsuranceCardMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("UpdateInsuranceCardMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
