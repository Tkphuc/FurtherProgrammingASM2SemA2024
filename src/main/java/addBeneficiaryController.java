import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*https://www.youtube.com/watch?v=hcM-R-YOKkQ*/
public class addBeneficiaryController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToAddBeneficiaryScreen1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAddBeneficiaryScreen2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBeneficiaryScreen2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPolicyOwnerMenu(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
