package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class GameDataBase {
    private final HashMap<String, Game> DATA_BASE = new HashMap<>();

    public GameDataBase() throws FileNotFoundException {
        PlatformerGame raymanLegends = (PlatformerGame) GameFactory.createGame(Genre.PLATFORMER, "Rayman Legends", "src/main/resources/com/project/gamecatalogue/RaymanLegends.jpg");
        raymanLegends.setPlayerFeedback(new ArrayList<>() {{
            add("excellent game!\n");
            add("This game is just perfect, nothing comes to my mind to make it even better.\n");
        }});

        PlatformerGame celeste = (PlatformerGame) GameFactory.createGame(Genre.PLATFORMER, "Celeste", "src/main/resources/com/project/gamecatalogue/Celeste.jpg");
        celeste.setPlayerFeedback(new ArrayList<>() {{
            add("Definitely one of my favourite games of all time. Very responsive, easy to learn hard to master movement that gets more fun the more you play. The game is good for both beginner players and hardcore players.\n");
            add("good game\n");
            add("A very overrated game with nothing too special\n");
        }});

        RpgGame baldursGate3 = (RpgGame) GameFactory.createGame(Genre.RPG, "Baldur's Gate 3", "src/main/resources/com/project/gamecatalogue/BaldursGate3.jpg");
        baldursGate3.setMetacriticRating(96);

        RpgGame fallout = (RpgGame) GameFactory.createGame(Genre.RPG, "Fallout: New Vegas", "src/main/resources/com/project/gamecatalogue/FalloutNewVegas.jpg");
        fallout.setMetacriticRating(84);

        RoguelikeGame issac = (RoguelikeGame) GameFactory.createGame(Genre.ROGUELIKE, "The Binding of Issac Rebirth", "src/main/resources/com/project/gamecatalogue/TheBindingofIssacRebirth.jpg");
        issac.setDifficultyRating(5);

        RoguelikeGame dungeonMaster = (RoguelikeGame) GameFactory.createGame(Genre.ROGUELIKE, "Dungeon Master", "src/main/resources/com/project/gamecatalogue/Dungeon Master.jpg");
        dungeonMaster.setDifficultyRating(11);

        DATA_BASE.put("Rayman Legends", raymanLegends);
        DATA_BASE.put("Celeste", celeste);
        DATA_BASE.put("Baldur's Gate 3", baldursGate3);
        DATA_BASE.put("Fallout: New Vegas", fallout);
        DATA_BASE.put("The Binding of Issac", issac);
        DATA_BASE.put("Dungeon Master", dungeonMaster);
    }

    public Game search(String name) {
        return DATA_BASE.getOrDefault(name, null);
    }
}
