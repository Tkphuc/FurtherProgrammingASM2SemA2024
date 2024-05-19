/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.insurance_manager_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import users.providers.InsuranceManager;

import java.io.IOException;

public class InsuranceManagerMenuController {
    @FXML private VBox functions;
    @FXML private Button retrieveSurveyorsButton;
    @FXML private Button retrieveAllCustomersButton;
    @FXML private Button exitButton;
    @FXML private Button retrieveAllClaimsButton;
    @FXML private Button approveMenuButton;
    private InsuranceManager insuranceManager;

    public InsuranceManagerMenuController() {
    }

    public InsuranceManager getInsuranceManager() {
        return insuranceManager;
    }

    public void setInsuranceManager(InsuranceManager insuranceManager) {
        this.insuranceManager = insuranceManager;
    }

    public void switchToLoginScreen(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("loginScreen.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToApproveClaimMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("InsuranceManagerFXMLFiles/ApproveClaim.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
