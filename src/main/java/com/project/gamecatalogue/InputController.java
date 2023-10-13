package com.project.gamecatalogue;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InputController {
    @FXML private Button searchButton;
    @FXML private TextField gameName;

    @FXML
    protected void openSearchWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameCatalogue.class.getResource("output.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = new Stage();
        OutputController outputController = fxmlLoader.getController();

        //1. UserData
        //stage.setUserData(gameName.getText());
        //outputController.initialize(stage);

        //2. Controller -> Controller
        outputController.initialize(gameName.getText());

        //3. Singleton
        //Singleton singleton = Singleton.getInstance();
        //singleton.setUserInput(gameName.getText());
        //outputController.initialize();

        Scene scene = new Scene(root);

        stage.setTitle("Game Catalogue");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        closeWindow();
    }

    private void closeWindow() {
        Stage stage = (Stage) searchButton.getScene().getWindow();
        stage.close();
    }
}