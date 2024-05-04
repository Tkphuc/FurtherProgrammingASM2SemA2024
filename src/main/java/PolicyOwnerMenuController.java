import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PolicyOwnerMenuController {

    @FXML private VBox claimFunctions;
    @FXML public Button fileClaim;
    @FXML public Button updateClaim;
    @FXML public Button retrieveClaim;
    @FXML public Button deleteClaim;

    @FXML public VBox beneficiaryFunctions;
    @FXML public Button addBeneficiary;
    @FXML public Button updateBeneficiary;
    @FXML public Button removeBeneficiary;

    @FXML  public Button calculateYearlyFees;
    @FXML public Button exit;
}
