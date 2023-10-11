package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PlatformerGame extends Game {
    private final ArrayList<String> PLAYER_FEEDBACK;

    public PlatformerGame(String name, Genre genre, String pathToImage, ArrayList<String> playerFeedback) throws FileNotFoundException {
        super(name, genre, pathToImage);

        PLAYER_FEEDBACK = playerFeedback;
    }

    @Override
    public void print() {
        super.print();

        //TODO: print additional data
    }
}
