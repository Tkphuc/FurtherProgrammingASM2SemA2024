package controllers;

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

public class PolicyOwnerMenuController {

    @FXML private VBox claimFunctions;
    @FXML public Button fileClaim;
    @FXML public Button updateClaim;
    @FXML public Button retrieveClaim;
    @FXML public Button deleteClaim;

    @FXML public VBox beneficiaryFunctions;
    @FXML public Button addBeneficiary;
    @FXML public Button updateBeneficiary;
    @FXML public Button removeBeneficiary;

    @FXML  public Button calculateYearlyFees;
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML Parent root;
    @FXML public Button exit;
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FileClaim.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToClaimInformationMenu(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("ClaimInformation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToViewBeneficiaryInfo(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("ClaimInformation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToLoginScreen(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
