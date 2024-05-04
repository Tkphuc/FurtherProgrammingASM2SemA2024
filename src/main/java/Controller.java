import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML private Button loginButton;
    @FXML private TextField IDField;
    @FXML private TextField passwordField;
    @FXML private Label IDLabel;
    @FXML private Label passwordLabel;
    @FXML private Pane popupPane;
    @FXML private TextArea wrongInput;

    protected String getEnteredID(){
     return IDField.getText();
    }
    protected String getEnteredPassword()
    {return passwordField.getText();}
    
}
