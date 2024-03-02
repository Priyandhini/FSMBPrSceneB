package Assigment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class MyAccountController {
    public Button lgoBtn;

    public void OnactionLogOut(ActionEvent actionEvent)throws IOException {

        Alert conf=new Alert(Alert.AlertType.CONFIRMATION,"Are You sure?", ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> buttonType = conf.showAndWait();


        }


    }

