/*
 * *
 *  * @author <Team 31>
 *
 */

import database.QueryExecutor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import database.QueryExecutor.*;

public class Main extends Application{
    @Override
    public void start(Stage stage){
        try {
            QueryExecutor executor = new QueryExecutor();
            QueryExecutor.connectDatabase();
            Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminFXMLFiles/SystemAdminMenu.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){

        }
    }
}