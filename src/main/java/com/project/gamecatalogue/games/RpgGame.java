package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RpgGame extends Game {
    private final int METACRITIC_RATING;

    public RpgGame(String name, Genre genre, String pathToImage, int metacriticRrating) throws FileNotFoundException {
        super(name, genre, pathToImage);
        METACRITIC_RATING = metacriticRrating;
    }

    @Override
    public void print() {
        super.print();

        //TODO: print function
    }
}
