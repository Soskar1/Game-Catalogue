package com.project.gamecatalogue;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InputController implements Initializable {
    @FXML private ChoiceBox<Genre> genre;
    @FXML private Button searchButton;
    @FXML private TextField gameName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        genre.getItems().addAll(Genre.values());
    }

    @FXML
    protected void openSearchWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameCatalogue.class.getResource("output.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = new Stage();
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