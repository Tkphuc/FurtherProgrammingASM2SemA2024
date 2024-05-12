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

public class SystemAdminMenuController {

    @FXML private Button addCustomerButton;
    @FXML private Button updateUserButton;
    @FXML private Button exitButton;
    @FXML private Button retrieveAllClaims;
    @FXML private Button addProviderButton;


    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToUpdateUser(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("UpdateUserInfo"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
