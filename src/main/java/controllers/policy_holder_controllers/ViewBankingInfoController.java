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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewBankingInfoController {
   @FXML private Text bankName;
    @FXML private Text receiverName;
    @FXML private Text accountNumber;
    private Claim claim;
    public void setBankName() {
        this.bankName.setText(claim.getReceiverBankingInfo().getBank());
    }

    public void setReceiverName() {
        this.receiverName.setText(claim.getReceiverBankingInfo().getName());
    }

    public void setAccountNumber() {
        this.accountNumber.setText(claim.getReceiverBankingInfo().getNumber());
    }
    public void setClaim(Claim claim) {
        this.claim = claim;
    }
    public void initialize(){
        setAccountNumber();
        setBankName();
        setReceiverName();
    }
    public void switchToRetrieveClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyHolderFXMLFiles/ShowDependentClaimMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }public void switchToShowDocument(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass().getResource("PolicyHolderFXMLFiles/ShowDocuments.fxml"));
        ShowDocumentController showDocumentController = loader.getController();
        showDocumentController.setClaim(claim);
        Parent parent = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
