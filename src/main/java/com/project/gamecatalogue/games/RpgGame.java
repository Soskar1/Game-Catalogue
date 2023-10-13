package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RpgGame extends Game {
    private int metacriticRating;

    public RpgGame(String name, Genre genre, String pathToImage) throws FileNotFoundException {
        super(name, genre, pathToImage);
    }

    public RpgGame(String name, Genre genre, String pathToImage, int metacriticRating) throws FileNotFoundException {
        super(name, genre, pathToImage);
        this.metacriticRating = metacriticRating;
    }

    public void setMetacriticRating(int metacriticRating) {
        this.metacriticRating = metacriticRating;
    }

    @Override
    public ArrayList<String> getInfo() {
        ArrayList<String> info = super.getInfo();
        info.add("Metascore: " + Integer.toString(metacriticRating) + "/100");
        return info;
    }
}
