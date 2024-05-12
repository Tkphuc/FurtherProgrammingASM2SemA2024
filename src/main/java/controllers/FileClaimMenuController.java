package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FileClaimMenuController {
    @FXML
    private TextField claimAmountField;
    @FXML
    private TextField examDateField;
    @FXML
    private TextField claimDateField;
    @FXML
    private TextField customerIDField;
    @FXML
    private TextField documentField;
    @FXML
    private Scene scene;
    @FXML private Stage stage;

    public FileClaimMenuController() {
    }

    public void switchToBankingInfoMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("ViewBanking.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchPolicyOwnerMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
