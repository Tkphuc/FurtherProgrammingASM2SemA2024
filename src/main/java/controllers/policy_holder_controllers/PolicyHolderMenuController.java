/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_holder_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import users.customers.PolicyHolder;

import java.io.IOException;


public class PolicyHolderMenuController {

    @FXML private VBox dependentFunctions;
    @FXML private Button fileDependent;
    @FXML private Button getDependent;
    @FXML private Button updateDependent;

    @FXML private VBox policyHolderFunctions;
    @FXML private Button getSelfInfo;
    @FXML private Button updateSelfInfo;

    @FXML private Button exit;
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML Parent root;

    private PolicyHolder policyHolder;

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    public void switchToLoginScreen(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateSelfInfo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.getClass().getResource("PolicyHolderFXMLFiles/UpdatePersonalInformationPolicyHolder.fxml");
        UpdatePolicyHolderInfoController updatePolicyHolderInfoController = loader.getController();
        //updatePolicyHolderInfoController.setPolicyHolder(/*current user*/);
        updatePolicyHolderInfoController.initialize();
        Parent parent = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToGetSelfInfo(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/ViewSelfInfo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToGetDependentInfo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.getClass().getResource("PolicyHolderFXMLFiles/ViewDependentInfo.fxml");

        Parent parent = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateDependentInfo(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/ViewSelfInfo.fxml"));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/FileClaim.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToChooseClaimToUpdateMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/ChooseClaimToUpdateMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToChooseClaimToRetreiveMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/ChooseClaimToRetrieveMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
