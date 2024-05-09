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


public class PolicyHolderMenuController {

    @FXML private VBox dependentFunctions;
    @FXML private Button fileDependent;
    @FXML private Button getDependent;
    @FXML private Button updateDependent;

    @FXML private VBox policyHolderFunctions;
    @FXML private Button getSelfInfo;
    @FXML private Button updateSelfInfo;

    @FXML  public Button exit;
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML Parent root;

    public void switchToLoginScreen(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUpdateSelfInfo(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("UpdatePersonalInformationPolicyholder.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToGetSelfInfo(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("ViewBeneficiaryInfo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
