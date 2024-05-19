/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_owner_controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class YearlyInsuranceFeeMenuController {
    @FXML private Button returnButton;
    @FXML private Button calculateButton;
    @FXML private Text yearlyFee;

    public void switchPolicyOwnerMenu(ActionEvent event) throws IOException {
        // Correct FXML file should be loaded, replace "PolicyHolderMenu.fxml" if that's not correct
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyOwnerFXMLFiles/PolicyOwnerMenu.fxml"));
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void setYearlyFee(String yearlyFee) {
        this.yearlyFee.setText(yearlyFee);
    }
    public void calculateYearlyFee(ActionEvent event){

        setYearlyFee();
    }
}
