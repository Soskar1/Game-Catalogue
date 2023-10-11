package com.project.gamecatalogue.games;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Game {
    private final String NAME;
    private final Genre GENRE;
    private final Image IMAGE;

    public Game(String name, Genre genre, String pathToImage) throws FileNotFoundException {
        NAME = name;
        GENRE = genre;
        IMAGE = new Image(new FileInputStream(pathToImage));
    }

    public void print() {

    }

    public Image getImage() {
        return IMAGE;
    }
}
