package controllers.policy_owner_controllers;

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

public class RetrieveBeneficiaryClaimMenuController {
    @FXML private Button returnButton;
    @FXML private Button showButton;
    @FXML private TextField claimIDField;


    public void switchToPolicyOwnerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerFXMLFiles/PolicyOwnerMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public String getClaimID(){return claimIDField.getText();}
    public void switchToClaimInformation(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent parent = loader.load(getClass().getResource("PolicyOwnerFXMLFiles/ClaimInformation.fxml"));
        ClaimInformationController claimInformationController = loader.getController();
        claimInformationController.setClaim();//get claim from claim id entered
        claimInformationController.initalize();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
