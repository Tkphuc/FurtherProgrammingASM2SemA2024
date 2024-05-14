package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class DependentMenuController {

    @FXML private Button exitButton;
    @FXML private Button retrieveInfoButton;
    @FXML private Button retrieveClaimButton;
    @FXML private VBox dependentFunctions;

    public DependentMenuController() {
    }

    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        // Assuming your login screen FXML file is in the same directory as this controller class
        Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
