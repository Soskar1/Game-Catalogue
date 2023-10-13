package com.project.gamecatalogue;

import com.project.gamecatalogue.games.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class OutputController {
    private final GameDataBase gameDataBase = new GameDataBase();

    @FXML private ImageView imageView;
    @FXML private Label gameName;
    @FXML private Label genre;
    @FXML private TextArea additionalInformation;

    //1. UserData
    public void initialize(Stage stage) {
        String userInput = (String) stage.getUserData();
        Game game = gameDataBase.search(userInput);

        try {
            display(game);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //2. Controller -> Controller
    public void initialize(String userInput) throws FileNotFoundException {
        Game game = gameDataBase.search(userInput);
        display(game);
    }

    //3. Singleton

    private void display(Game game) throws FileNotFoundException {
        if (game == null) {
            imageView.setImage(new Image(new FileInputStream("src/main/resources/com/project/gamecatalogue/SadFace.png")));
            gameName.setText("Game not found");
            genre.setText("Genre: undefined");
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
