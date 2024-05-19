/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers.policy_owner_controllers;

import claim.Claim;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class ViewBankingInfoController {
    @FXML private
    Button nextButton;
    @FXML private  Text bankName;
    @FXML private  Text receiverName;
    @FXML private  Text accountNumber;
    private Claim claim;

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public void setReceiverName() {
        this.receiverName.setText(claim.getReceiverBankingInfo().getName());
    }

    public void setAccountNumber() {
        this.accountNumber.setText(claim.getReceiverBankingInfo().getNumber());
    }

    public void setBankName() {
        this.bankName.setText(claim.getReceiverBankingInfo().getBank());
    }
    public void initalize(){
        setBankName();
        setAccountNumber();
        setReceiverName();
    }

}
