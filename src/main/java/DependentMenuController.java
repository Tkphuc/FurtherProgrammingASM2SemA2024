import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class DependentMenuController {

    @FXML  public Button exit;
    @FXML private VBox dependentFunctions;
    @FXML private Button retrieveClaim;
    @FXML private Button retrieveInfo;

    /*
    * Why when I set these attributes as public
    * they have purple color but when private
    * they are grey and said
    * "assigned but never accessed"
    * */
}
