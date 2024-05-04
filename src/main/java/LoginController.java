import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML private Button loginButton;
    @FXML private TextField IDField;
    @FXML private PasswordField passwordField;
    @FXML private Label IDLabel;
    @FXML private Label passwordLabel;
    @FXML private Label welcomeLabel;

    protected String getEnteredID(){
     return IDField.getText();
    }
    protected String getEnteredPassword()
    {return passwordField.getText();}
    
}
