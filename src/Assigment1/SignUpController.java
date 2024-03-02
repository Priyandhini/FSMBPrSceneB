package Assigment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

public class SignUpController {


    public Button LoginBtn2;
    public AnchorPane SignUpWindow;
    public ComboBox<String> cmbLang;

    ArrayList<String>myLanguages=new ArrayList<>(Arrays.asList("English","Tamil","Sinhala","French","Russian","German"));

    public void initialize(){
        ObservableList<String>ObList= FXCollections.observableList(myLanguages);
        cmbLang.setItems(ObList);

    }

    public void OnActionLbtn2(ActionEvent actionEvent) throws IOException {
       
        

        Parent parent= FXMLLoader.load(
                getClass().getResource("../Assigment1/DashBoard.fxml")
        );


        Stage stage=(Stage)SignUpWindow.getScene().getWindow();
        stage.setScene(new Scene(parent));


    }



    }

