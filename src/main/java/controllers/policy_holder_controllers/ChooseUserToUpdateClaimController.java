/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_holder_controllers;

import claim.Claim;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseUserToUpdateClaimController {

    @FXML private TextField claimIDField;
    private Claim claim;
    public String getClaimIDField() {
        return claimIDField.getText();
    }

    public void switchScence(ActionEvent event){

    }
    public void getClaimFromDatabase(){
        if(!getClaimIDField().isBlank() && getClaimIDField() != null ){
            if(getClaimIDField() )
        }
    }

    public void switchToPolicyHolderMenuController(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateClaimMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/UpdateClaimMenu.fxml"));
        UpdateClaimMenuController updateClaimMenuController =loader.getController();
        updateClaimMenuController.setClaim(claim);
        updateClaimMenuController.initalize();
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
