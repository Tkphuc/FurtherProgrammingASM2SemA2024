package controllers;

import claim.Claim;
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

public class ConfirmNewClaimInfo1Controller {
    @FXML private Button returnButton;
    @FXML private Button NextButton;
    @FXML private Text claimIDText;
    @FXML private Text claimDateText;
    @FXML private Text insuredPersonName;
    @FXML private Text insuredPersonIDText;
    @FXML private Text cardNumberText;
    @FXML private Text claimAmountText;
    @FXML private Text receiverNameText;
    @FXML private Text receiverBankText;
    @FXML private Text receiverBankNumberText;

    public void setClaimDateText(String claimDate) {
        this.claimDateText.setText(claimDate);
    }

    public void setClaimIDText(String claimID) {
        this.claimIDText.setText(claimID);
    }

    public void setInsuredPersonName(String insuredPersonName) {
        this.insuredPersonName.setText(insuredPersonName);
    }

    public void setInsuredPersonIDText(String insuredPersonID) {
        this.insuredPersonIDText.setText(insuredPersonID);
    }

    public void setClaimAmountText(String claimAmount) {
        this.claimAmountText.setText(claimAmount);
    }

    public void setCardNumberText(String cardNumberText) {
        this.cardNumberText.setText(cardNumberText);
    }

    public void setReceiverNameText(String receiverNameText) {
        this.receiverNameText.setText(receiverNameText);
    }

    public void setReceiverBankText(String receiverBankText) {
        this.receiverBankText.setText(receiverBankText);
    }

    public void setReceiverBankNumberText(String receiverBankNumberText) {
        this.receiverBankNumberText.setText(receiverBankNumberText);
    }
    public void switchToReceiverBankingInfo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent parent = loader.load(getClass().getResource("FileReceiverBankingInfo.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToConfirmNewClamInfo2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent parent = loader.load(getClass().getResource("ConfirmNewClaimInfo2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
