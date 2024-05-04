import javafx.event.ActionEvent;
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

    public TextField beneficiaryTypeField;
    public TextField beneficiaryNameField;
    public TextField beneficiaryAddress;
    public TextField beneficiaryEmail;
    public TextField beneficiaryPhoneNumber;
    public Button returnButton;
    public Button nextButton;
    public Scene Scene1;
    public Scene Scene2;
    public Stage stage;
    public TextField cardIDField;
    public DatePicker expirationDateField;


    public void switchToScene1(ActionEvent event) throws IOException {
        stage.setScene(Scene1);
        stage.show();
    }
    public void switchToScene2(){
        stage.setScene(Scene2);
        stage.show();
    }
}
