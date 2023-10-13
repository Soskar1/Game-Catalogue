package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;

public class GameFactory {
    public static Game createGame(Genre genre, String name, String pathToImage) throws FileNotFoundException {
        return switch (genre) {
            case RPG -> new RpgGame(name, genre, pathToImage);
            case ROGUELIKE -> new RoguelikeGame(name, genre, pathToImage);
            case PLATFORMER -> new PlatformerGame(name, genre, pathToImage);
        };
    }
}
