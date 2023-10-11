package com.project.gamecatalogue;

import com.project.gamecatalogue.games.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class OutputController implements Initializable {
    private final GameDataBase gameDataBase = new GameDataBase();

    @FXML private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
