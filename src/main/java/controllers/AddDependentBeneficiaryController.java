package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddDependentBeneficiaryController {

   @FXML private TextField policyHolderOfDependentField;

    public String getPolicyHolderOfDependentField() {
        return policyHolderOfDependentField.getText();
    }
}
