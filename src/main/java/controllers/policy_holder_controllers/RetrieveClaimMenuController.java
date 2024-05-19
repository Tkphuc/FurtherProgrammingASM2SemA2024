/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_holder_controllers;

import claim.Claim;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import other_utilities.DateWrapper;

import java.io.IOException;

public class RetrieveClaimMenuController {

    @FXML private Text claimIDText;
    @FXML private Text insuredPersonName;
    @FXML private Text insuredPersonID;
    @FXML private Text cardNumber;
    @FXML private Button returnButton;
    @FXML private Text examDate;
    @FXML private Text claimAmount;
    @FXML private Text claimDate;
    @FXML private Text status;
    @FXML private TextField claimIDField;

    Claim claim;
    DateWrapper dateWrapper = new DateWrapper();



    public void setInsuredPersonName() {
        this.insuredPersonName.setText(claim.getInsuredPerson().getFullName());
    }

    public void setInsuredPersonID() {
        this.insuredPersonID.setText(claim.getInsuredPerson().getID());
    }

    public void setCardNumber() {
        this.cardNumber.setText(claim.getCardNumber());
    }

    public void setClaimAmount() {
        this.claimAmount.setText(String.valueOf(claim.getClaimAmount()));
    }

    public void setExamDate() {
        this.examDate.setText(dateWrapper.dateToString(claim.getExamDate()));
    }

    public void setClaimDate() {
        this.claimDate.setText(dateWrapper.dateToString(claim.getClaimDate()));
    }

    public void setClaimID() {
        this.claimIDText.setText(claim.getClaimID());
    }

    public void setStatus() {
        status.setText(claim.getStatus().toString());
    }
    public void setClaim(Claim claim){
        this.claim = claim;
    }
    public void initialize(){
        setStatus();
        setClaimID();
        setCardNumber();
        setClaimAmount();
        setClaimDate();
        setExamDate();
        setInsuredPersonID();
        setInsuredPersonName();
    }
    public void switchToViewBankingInfo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/UpdateClaimMenu.fxml"));
        ViewBankingInfoController viewBankingInfoController = loader.getController();
        viewBankingInfoController.setClaim(claim);
        viewBankingInfoController.initialize();
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
