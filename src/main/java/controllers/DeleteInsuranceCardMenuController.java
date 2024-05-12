package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DeleteInsuranceCardMenuController {

    @FXML private TextField insuranceCardIDField;
    @FXML private Button confirmButton;


    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public String getInsuranceCardID(){return this.insuranceCardIDField.getText();}

}
