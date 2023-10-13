package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RoguelikeGame extends Game {
    private int difficultyRating;

    public RoguelikeGame(String name, Genre genre, String pathToImage) throws FileNotFoundException {
        super(name, genre, pathToImage);
    }

    public RoguelikeGame(String name, Genre genre, String pathToImage, int difficultyRating) throws FileNotFoundException {
        super(name, genre, pathToImage);

        this.difficultyRating = difficultyRating;
    }

    public void setDifficultyRating(int difficultyRating) {
        this.difficultyRating = difficultyRating;
    }

    @Override
    public ArrayList<String> getInfo() {
        ArrayList<String> info = super.getInfo();
        info.add("Difficulty: " + difficultyRating + "/10");
        return info;
    }
}
