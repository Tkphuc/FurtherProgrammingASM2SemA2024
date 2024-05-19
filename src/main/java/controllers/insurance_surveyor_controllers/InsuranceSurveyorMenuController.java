/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.insurance_surveyor_controllers;

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

public class InsuranceSurveyorMenuController {
   @FXML private Button exitButton;
    @FXML
    private VBox functions;

    @FXML
    private Button reqMoreClaimInfo;
    @FXML
    private Button proposeClaim;

    @FXML
    private Button retrieveAllClaims;
    @FXML
    private Button retrieveAllCustomers;
    @FXML
    private Stage stage;
    @FXML private Scene scene;

    public InsuranceSurveyorMenuController() {
    }

    public void switchToLoginScreen(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("loginScreen.fxml"));
        Parent parent = loader.load();;
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
