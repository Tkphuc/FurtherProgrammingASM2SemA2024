import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/*https://www.youtube.com/watch?v=hcM-R-YOKkQ
* */
public class addBeneficiaryController {


    @FXML public TextField beneficiaryTypeField;
    @FXML public TextField beneficiaryNameField;
    @FXML public TextField beneficiaryAddress;
    @FXML public TextField beneficiaryEmail;
    @FXML public TextField beneficiaryPhoneNumber;
    @FXML public Button returnButton;
    @FXML public Button nextButton;
    @FXML public Scene Scene1;
    @FXML public Scene Scene2;
    @FXML public Stage stage;
    @FXML public TextField cardIDField;
    @FXML public TextField expirationDateField;


    public void switchToScene1(ActionEvent event) throws IOException {
        stage.setScene(Scene1);
        stage.show();
    }
    public void switchToScene2(){
        stage.setScene(Scene2);
        stage.show();
    }
}
