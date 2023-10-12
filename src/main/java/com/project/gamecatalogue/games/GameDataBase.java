package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class GameDataBase {
    private final HashMap<String, Game> DATA_BASE = new HashMap<>() {{
        try {
            put("Rayman Legends", new PlatformerGame("Rayman Legends", Genre.PLATFORMER, "src/main/resources/com/project/gamecatalogue/RaymanLegends.jpg",new ArrayList<>() {{
                add("excellent game!\n");
                add("This game is just perfect, nothing comes to my mind to make it even better.\n");
            }}));

            put("Celeste", new PlatformerGame("Celeste", Genre.PLATFORMER, "src/main/resources/com/project/gamecatalogue/Celeste.jpg", new ArrayList<>() {{
                add("Definitely one of my favourite games of all time. Very responsive, easy to learn hard to master movement that gets more fun the more you play. The game is good for both beginner players and hardcore players.\n");
                add("good game\n");
                add("A very overrated game with nothing too special\n");
            }}));

            put("Baldur's Gate 3", new RpgGame("Baldur's Gate 3", Genre.RPG, "src/main/resources/com/project/gamecatalogue/BaldursGate3.jpg",96));
            put("Fallout: New Vegas", new RpgGame("Fallout: New Vegas", Genre.RPG, "src/main/resources/com/project/gamecatalogue/FalloutNewVegas.jpg",84));

            put("The Binding of Issac", new RoguelikeGame("The Binding of Issac Rebirth", Genre.ROGUELIKE, "src/main/resources/com/project/gamecatalogue/TheBindingofIssacRebirth.jpg",5));
            put("Dungeon Master", new RoguelikeGame("Dungeon Master", Genre.ROGUELIKE, "src/main/resources/com/project/gamecatalogue/Dungeon Master.jpg", 11));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }};

    public Game search(String name) {
        return DATA_BASE.getOrDefault(name, null);
    }
}
