package controllers.policy_holder_controllers;

import claim.Claim;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseUserToRetrieveClaimController {

    @FXML private TextField claimIDField;
    private Claim claim;
    public String getClaimID() {
        return claimIDField.getText();
    }
    public void getClaimFromDatabase(){
        if(!getClaimID().isBlank() && getClaimID() != null ){
            if(getClaimID() )
        }
    }


    public void switchToPolicyHolderMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRetrieveClaimMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/RetrieveClaimMenu.fxml"));
        RetrieveClaimMenuController retrieveClaimMenuController =loader.getController();
        retrieveClaimMenuController.setClaim(claim);
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
