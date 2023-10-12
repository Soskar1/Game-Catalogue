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
    public ArrayList<String> getInfo() {
        ArrayList<String> info = super.getInfo();
        info.add("Player feedback:\n");
        info.addAll(PLAYER_FEEDBACK);
        return info;
    }
}
