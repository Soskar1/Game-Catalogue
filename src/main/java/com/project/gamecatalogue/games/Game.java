package com.project.gamecatalogue.games;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Game {
    private final String NAME;
    private final Genre GENRE;
    private final Image IMAGE;

    public Game(String name, Genre genre, String pathToImage) throws FileNotFoundException {
        NAME = name;
        GENRE = genre;
        IMAGE = new Image(new FileInputStream(pathToImage));
    }

    public ArrayList<String> getInfo() {
        ArrayList<String> info = new ArrayList<>();
        info.add(NAME);
        info.add(GENRE.name());

        return info;
    }

    public Image getImage() {
        return IMAGE;
    }
}
