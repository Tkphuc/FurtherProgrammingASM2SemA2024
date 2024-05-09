import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceiverBankingInfoController {
    @FXML
    private Stage stage;
    @FXML private Scene scene;
    public void switchToFileClaimMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FileClaim.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
