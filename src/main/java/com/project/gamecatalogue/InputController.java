package com.project.gamecatalogue;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class InputController implements Initializable {
    @FXML private ChoiceBox<Genre> genre;
    @FXML private TextField gameName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        genre.getItems().addAll(Genre.values());
    }

    @FXML
    protected void onSearchButtonClick() {
        System.out.println("Hello, World!");
    }
}