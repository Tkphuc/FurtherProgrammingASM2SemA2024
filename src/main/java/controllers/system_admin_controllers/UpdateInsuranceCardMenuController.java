/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.system_admin_controllers;

import insurance_card.InsuranceCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Date;

import javafx.stage.Stage;
import other_utilities.DateWrapper;

public class UpdateInsuranceCardMenuController {

    @FXML private Button saveButton;
    @FXML private Text currentExpirationDate;
    @FXML private TextField newExpirationDateField;
    private DateWrapper dateWrapper = new DateWrapper();
    private InsuranceCard insuranceCard;
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/SystemAdminMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public String getNewExpirationDate() {
        return newExpirationDateField.getText();
    }
    public void setCurrentExpirationDate(Date currentExpirationDate){
        this.currentExpirationDate.setText(dateWrapper.dateToString(currentExpirationDate));
    }
    public void saveNewInfo(){
        insuranceCard.setExpirationDate(wrapDate(getNewExpirationDate()));
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }

    private Date wrapDate(String date){
        return dateWrapper.dateCreate(date);
    }

}
