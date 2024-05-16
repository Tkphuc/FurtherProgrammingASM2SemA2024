package controllers.dependent_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class DependentMenuController {

    @FXML  private Button exit;
    @FXML private Button retrieveInfoButton;
    @FXML private Button exitButton;
    @FXML private Button retrieveClaimButton;
    @FXML private VBox dependentFunctions;
    @FXML private Button retrieveClaim;
    @FXML private Button retrieveInfo;

    public DependentMenuController() {
    }

    public void switchToLoginScreen(ActionEvent event) throws IOException {
        FXMLLoader loader =new FXMLLoader();
        loader.load(getClass().getResource("loginScreen.fxml"));
        Parent parent = loader.load();
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRetrieveClaimMenu(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("DependentFXMLFiles/RetrieveDependentClaimMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRetrieveInfoMenu(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("DependentFXMLFiles/RetrieveDependentClaimMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
