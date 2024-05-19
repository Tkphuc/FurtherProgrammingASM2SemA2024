/*
 * *
 *  * @author <Team 31>
 *
 */

package controllers;

import controllers.insurance_manager_controllers.InsuranceManagerMenuController;
import controllers.insurance_surveyor_controllers.InsuranceSurveyorMenuController;
import controllers.policy_holder_controllers.PolicyHolderMenuController;
import controllers.policy_owner_controllers.PolicyOwnerMenuController;
import controllers.dependent_controllers.DependentMenuController;
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
import users.SystemAdmin;
import users.Users;
import users.customers.Customer;
import users.customers.Dependent;
import users.customers.PolicyHolder;
import users.customers.PolicyOwner;
import users.providers.InsuranceManager;
import users.providers.InsuranceSurveyor;
import users.providers.Provider;

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
    @FXML private  Parent parent;

    @FXML protected String getEnteredID(){
     return IDField.getText();
    }
    @FXML protected String getEnteredPassword()
    {return passwordField.getText();}

    public LoginController() {
    }
    /*
    public void showLoginScreen(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
            scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        }

    }*/
    @FXML
    public void Login(ActionEvent event){
      boolean b = user.Login(getEnteredID(),getEnteredPassword());
      if(!b){

      }else if(b){
          if(user instanceof Customer){
              switch (user) {
                  case PolicyOwner policyOwner -> {
                      Parent root = null;
                      try {
                          FXMLLoader loader = new FXMLLoader();
                          loader.getClass().getResource("PolicyOwnerFXMLFiles/PolicyOwnerMenu.fxml");
                          PolicyOwnerMenuController policyOwnerMenuController = loader.getController();
                          root = loader.load();
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
                          FXMLLoader loader = new FXMLLoader();
                          loader.getClass().getResource("PolicyHolderFXMLFiles/PolicyHolderMenu.fxml");
                          PolicyHolderMenuController policyHolderMenuController = loader.getController();
                          policyHolderMenuController.setPolicyHolder((PolicyHolder) user);
                          root = loader.load();;
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
                          FXMLLoader loader = new FXMLLoader();
                          loader.getClass().getResource("DependentFXMLFiles/DependentMenu.fxml");
                          DependentMenuController dependentMenuController = loader.getController();
                          dependentMenuController.setDependent((Dependent) user);
                          root = loader.load();
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
                          FXMLLoader loader = new FXMLLoader();
                          loader.getClass().getResource("InsuranceManagerFXMLFiles/InsuranceManagerMenu.fxml");
                          InsuranceManagerMenuController insuranceManagerMenuController= loader.getController();
                          insuranceManagerMenuController.setInsuranceManager((InsuranceManager) user);
                          root = loader.load();
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
                          FXMLLoader loader = new FXMLLoader();
                          loader.getClass().getResource("InsuranceSurveyorFXMLFiles/InsuranceSurveyorMenu.fxml");
                          InsuranceSurveyorMenuController insuranceSurveyorMenuController= loader.getController();
                          insuranceSurveyorMenuController.setInsuranceManager((InsuranceManager) user);
                          root = loader.load();

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
                  root = FXMLLoader.load(getClass().getResource("SystemAdminMenuController.fxml"));
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

}
