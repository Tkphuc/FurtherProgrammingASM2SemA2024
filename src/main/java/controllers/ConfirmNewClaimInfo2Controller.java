package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ConfirmNewClaimInfo2Controller {
    private @FXML Button returnButton;
    private @FXML Button saveButton;

    public void switchToConfirmNewClamInfo1(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("ConfirmNewClaimInfo1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
