package controllers.dependent_controllers;

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

public class RetrieveDependentClaimMenuController {
    @FXML private Button returnButton;
    @FXML private Button showButton;
    @FXML private TextField claimIDField;

    public String getClaimIDField() {
        return claimIDField.getText();
    }
    public void switchToDependentMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DependentMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
