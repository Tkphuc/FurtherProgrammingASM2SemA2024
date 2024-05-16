package controllers.policy_owner_controllers;

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
    @FXML private Button fileClaim;
    @FXML private Button updateClaim;
    @FXML private Button retrieveClaim;
    @FXML private Button deleteClaim;

    @FXML private VBox beneficiaryFunctions;
    @FXML private Button addBeneficiary;
    @FXML private Button updateBeneficiary;
    @FXML private Button removeBeneficiary;

    @FXML private Button calculateYearlyFees;
    @FXML private Button exit;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public PolicyOwnerMenuController() {
        stage = new Stage();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/path/to/PolicyOwnerMenu.fxml"));
            root = loader.load();
            scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();  // Log or handle the exception properly
        }
    }

    public void showStage() {
        stage.showAndWait();
    }

    @FXML
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        switchScene("PolicyOwnerFXMLFiles/FileClaim.fxml", event);
    }

    @FXML
    public void switchToClaimInformationMenu(ActionEvent event) throws IOException {
        switchScene("PolicyOwnerFXMLFiles/ClaimInformation.fxml", event);
    }

    @FXML
    public void switchToViewBeneficiaryInfo(ActionEvent event) throws IOException {
        switchScene("PolicyOwnerFXMLFiles/ClaimInformation.fxml", event);
    }

    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        switchScene("loginScreen.fxml", event);
    }

    @FXML
    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        switchScene("PolicyOwnerFXMLFiles/AddBeneficiaryScreen1.fxml", event);
    }

    private void switchScene(String fxmlFile, ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/path/to/" + fxmlFile));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
        currentStage.show();
    }
}
