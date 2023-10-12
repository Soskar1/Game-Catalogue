package com.project.gamecatalogue;

import com.project.gamecatalogue.games.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class OutputController {
    private final GameDataBase gameDataBase = new GameDataBase();

    @FXML private ImageView imageView;
    @FXML private Label gameName;
    @FXML private Label genre;
    @FXML private TextArea additionalInformation;

    public void initialize(String userInput) {
        Game game = gameDataBase.search(userInput);

        if (game == null) {
            System.out.println("TODO: make an error window");
            return;
        }

        ArrayList<String> info = game.getInfo();
        gameName.setText(info.get(0));
        genre.setText("Genre: " + info.get(1));

        Image image = game.getImage();
        imageView.setImage(image);

        for (int i = 2; i < info.size(); ++i) {
            additionalInformation.appendText(info.get(i));
        }
    }
}
