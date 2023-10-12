package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RpgGame extends Game {
    private final int METACRITIC_RATING;

    public RpgGame(String name, Genre genre, String pathToImage, int metacriticRating) throws FileNotFoundException {
        super(name, genre, pathToImage);
        METACRITIC_RATING = metacriticRating;
    }

    @Override
    public ArrayList<String> getInfo() {
        ArrayList<String> info = super.getInfo();
        info.add("Metascore: " + Integer.toString(METACRITIC_RATING) + "/100");
        return info;
    }
}
