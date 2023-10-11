package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;

public class RoguelikeGame extends Game {
    private final int DIFFICULTY_RATING;

    public RoguelikeGame(String name, Genre genre, String pathToImage, int difficultyRating) throws FileNotFoundException {
        super(name, genre, pathToImage);

        DIFFICULTY_RATING = difficultyRating;
    }

    @Override
    public void print() {
        super.print();

        //TODO print additional data
    }
}
