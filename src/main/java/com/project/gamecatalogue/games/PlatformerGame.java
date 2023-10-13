package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PlatformerGame extends Game {
    private ArrayList<String> playerFeedback;

    public PlatformerGame(String name, Genre genre, String pathToImage) throws FileNotFoundException {
        super(name, genre, pathToImage);
    }

    public PlatformerGame(String name, Genre genre, String pathToImage, ArrayList<String> playerFeedback) throws FileNotFoundException {
        super(name, genre, pathToImage);

        this.playerFeedback = playerFeedback;
    }

    public void setPlayerFeedback(ArrayList<String> playerFeedback) {
        this.playerFeedback = playerFeedback;
    }

    @Override
    public ArrayList<String> getInfo() {
        ArrayList<String> info = super.getInfo();
        info.add("Player feedback:\n");
        info.addAll(playerFeedback);
        return info;
    }
}
