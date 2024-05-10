import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML private Button loginButton;
    @FXML private TextField IDField;
    @FXML private PasswordField passwordField;
    @FXML private Label IDLabel;
    @FXML private Label passwordLabel;
    @FXML private Label welcomeLabel;
    private Users user;
    @FXML
    private Stage stage;
    @FXML private Scene scene;
    @FXML protected String getEnteredID(){
     return IDField.getText();
    }
    @FXML protected String getEnteredPassword()
    {return passwordField.getText();}
    public void Login(ActionEvent event){
      boolean b = user.Login(getEnteredID(),getEnteredPassword());
      if(!b){

      }else if(b){
          if(user instanceof Customer){
              switch (user) {
                  case PolicyOwner policyOwner -> {
                      Parent root = null;
                      try {
                          root = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
                      } catch (IOException e) {
                          throw new RuntimeException(e);
                      }
                      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                      scene = new Scene(root);
                      stage.setScene(scene);
                      stage.show();
                  }
                  case PolicyHolder policyHolder -> {
                      Parent root = null;
                      try {
                          root = FXMLLoader.load(getClass().getResource("PolicyHolderMenu.fxml"));
                      } catch (IOException e) {
                          throw new RuntimeException(e);
                      }
                      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                      scene = new Scene(root);
                      stage.setScene(scene);
                      stage.show();
                  }
                  case Dependent dependent -> {
                      Parent root = null;
                      try {
                          root = FXMLLoader.load(getClass().getResource("DependentMenu.fxml"));
                      } catch (IOException e) {
                          throw new RuntimeException(e);
                      }
                      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                      scene = new Scene(root);
                      stage.setScene(scene);
                      stage.show();
                  }
                  default -> {
                  }
              }
          }else if (user instanceof Provider){
              switch (user) {
                  case InsuranceManager insuranceManager -> {
                      Parent root = null;
                      try {
                          root = FXMLLoader.load(getClass().getResource("InsuranceManagerMenu.fxml"));
                      } catch (IOException e) {
                          throw new RuntimeException(e);
                      }
                      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                      scene = new Scene(root);
                      stage.setScene(scene);
                      stage.show();
                  }
                  case InsuranceSurveyor insuranceSurveyor -> {
                      Parent root = null;
                      try {
                          root = FXMLLoader.load(getClass().getResource("InsuranceSurveyorMenu.fxml"));
                      } catch (IOException e) {
                          throw new RuntimeException(e);
                      }
                      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                      scene = new Scene(root);
                      stage.setScene(scene);
                      stage.show();
                  }
                  default -> {
                  }
              }
          } else if (user instanceof SystemAdmin) {
              Parent root = null;
              try {
                  root = FXMLLoader.load(getClass().getResource("SystemAdminMenu.fxml"));
              } catch (IOException e) {
                  throw new RuntimeException(e);
              }
              stage = (Stage)((Node)event.getSource()).getScene().getWindow();
              scene = new Scene(root);
              stage.setScene(scene);
              stage.show();
          }
      }

    }
     /*
    public void switchToPolicyOwnerMenu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PolicyOwnerMenu.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPolicyHolderMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PolicyHolderMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDependentMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DependentMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToInsuranceManagerMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InsuranceManagerMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToInsuranceSurveyorMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InsuranceSurveyorMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSystemAdminMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SystemAdminMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/
}
