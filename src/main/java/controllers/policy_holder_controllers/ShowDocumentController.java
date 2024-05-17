package controllers.policy_holder_controllers;

import claim.Claim;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ShowDocumentController {
    @FXML private ListView documentNameList;
    private Claim claim;

    public void setClaim(Claim claim) {
        this.claim = claim;
    }
}
