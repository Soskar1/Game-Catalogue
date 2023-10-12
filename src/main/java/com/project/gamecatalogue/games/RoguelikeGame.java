package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RoguelikeGame extends Game {
    private final int DIFFICULTY_RATING;

    public RoguelikeGame(String name, Genre genre, String pathToImage, int difficultyRating) throws FileNotFoundException {
        super(name, genre, pathToImage);

        DIFFICULTY_RATING = difficultyRating;
    }

    @Override
    public ArrayList<String> getInfo() {
        ArrayList<String> info = super.getInfo();
        info.add("Difficulty: " + Integer.toString(DIFFICULTY_RATING) + "/10");
        return info;
    }
}
