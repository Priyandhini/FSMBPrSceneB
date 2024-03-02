package Assigment1;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainFirmControler {
    public AnchorPane Mainpage;
    public TextField Username;
    public PasswordField password;


    public  void OnActionLBtn(ActionEvent actionEvent)throws IOException  {





        Parent parent= FXMLLoader.load(
                getClass().getResource("../Assigment1/DashBoard.fxml")
        );


        Stage stage=(Stage)Mainpage.getScene().getWindow();
        stage.setScene(new Scene(parent));


    }

    public void OnActionSBtn(ActionEvent actionEvent)throws IOException  {


        Parent parent= FXMLLoader.load(
                getClass().getResource("../Assigment1/SignUp.fxml")
        );

        Stage stage=(Stage)Mainpage.getScene().getWindow();
        stage.setScene(new Scene(parent));

    }
}
