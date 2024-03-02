package Assigment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {

       launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {


        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ManiForm.fxml"))));
        primaryStage.show();





        }
    }



