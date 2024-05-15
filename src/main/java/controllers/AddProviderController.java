package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.providers.Provider;
import users.providers.providerFactory;

import java.io.IOException;

public class AddProviderController {
    @FXML private TextField providerNameField;
    @FXML private  TextField providerIDField;
    @FXML private TextField providerPasswordField;
    @FXML private  CheckBox managerTypeChoice;
    @FXML private  CheckBox SurveyorTypeChoice;
    @FXML private  Button saveButton;
    @FXML private  Button returnButton;
    private final String[] providerTypes = {"Insurance Manager","Insurance Surveyor"};
    private String chosenType;

     public String getProviderName(){return providerNameField.getText();}
    public String getProviderPassword(){return providerPasswordField.getText();}
    public String getProviderIDField(){return providerIDField.getText();}


    @FXML
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SystemAdminMenu.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void saveInfo(){
         if(chosenType.equalsIgnoreCase(providerTypes[0])){
             users.providers.providerFactory.createProvider(chosenType);
         } else if (chosenType.equalsIgnoreCase(providerTypes[1])) {
             users.providers.providerFactory.createProvider(chosenType);
         }else {

         }
    }

}
