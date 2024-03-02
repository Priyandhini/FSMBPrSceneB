package Assigment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {

    public AnchorPane DashBoard;


    private void SetUi(String Location)throws IOException {
        DashBoard.getChildren().clear();
        DashBoard.getChildren().add(FXMLLoader.load(
                getClass().getResource(Location )));





    }

    public void OnActionW1btn(ActionEvent actionEvent) throws IOException {
        SetUi("../Assigment1/Window1.fxml");
    }

    public void OnActionW2Btn(ActionEvent actionEvent) throws IOException {
        SetUi("../Assigment1/Window2.fxml");
    }


    public void OnActionmyacBtn(ActionEvent actionEvent) throws IOException {
        SetUi("../Assigment1/MyAccount.fxml");

    }
}
















