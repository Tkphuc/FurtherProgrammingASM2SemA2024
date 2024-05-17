package controllers.policy_holder_controllers;

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
    public String getClaimID() {
        return claimIDField.getText();
    }



    public void switchToPolicyHolderMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
