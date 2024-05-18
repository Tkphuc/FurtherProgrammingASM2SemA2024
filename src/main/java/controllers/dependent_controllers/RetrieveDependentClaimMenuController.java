package controllers.dependent_controllers;

import claim.Claim;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.customers.Dependent;

import java.io.IOException;

public class RetrieveDependentClaimMenuController {
    @FXML private Button returnButton;
    @FXML private Button showButton;
    @FXML private TextField claimIDField;
    private Claim claim;
    private Dependent dependent;
    public String getClaimIDField() {
        return claimIDField.getText();
    }
    public Claim getClaim(){}//search for claim from claim id field
    public void switchToDependentMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DependentFXMLFiles/DependentMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToShowDependentClaimMenu(ActionEvent event) throws IOException {
        FXMLLoader loader =new FXMLLoader();
        loader.load(getClass().getResource("DependentFXMLFiles/ShowDependentClaimMenu.fxml"));
        ShowDependentClaimController showDependentClaimController = loader.getController();
        showDependentClaimController.setClaim(this.claim);
        showDependentClaimController.initialize();
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
