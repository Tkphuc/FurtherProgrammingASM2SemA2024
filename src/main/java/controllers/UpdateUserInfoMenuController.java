package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class UpdateUserInfoMenuController {
    @FXML private  PasswordField newPasswordField;
    @FXML private TextField newIDField;
    @FXML private TextField newFullNameField;
    @FXML private  Text currentID;
    @FXML private  Text currentFullName;
    @FXML private  Text currentPassword;
    private Users user;
    public void setCurrentID() {
       this.currentID.setText(user.getID());
    }

    public void setCurrentFullName() {
       this.currentFullName.setText(user.getFullName());
    }

    public void setCurrentPassword() {
      this.currentPassword.setText(user.getPassword());
    }

    public String getNewID() {
        return newIDField.getText();
    }

    public String getNewPassword() {
        return newPasswordField.getText();
    }

    public String getNewFullName() {
        return newFullNameField.getText();
    }
}
