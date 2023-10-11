package com.project.gamecatalogue.games;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class GameDataBase {
    public final HashMap<Genre, ArrayList<Game>> DATA_BASE = new HashMap<>() {{
        try {
            put(Genre.PLATFORMER, new ArrayList<>() {{

                    add(new PlatformerGame("Rayman Legends", Genre.PLATFORMER, "src/main/resources/com/project/gamecatalogue/RaymanLegends.jpg",new ArrayList<>() {{
                        add("excellent game!");
                        add("This game is just perfect, nothing comes to my mind to make it even better.");
                    }}));
                    add(new PlatformerGame("Celeste", Genre.PLATFORMER, "src/main/resources/com/project/gamecatalogue/Celeste.jpg", new ArrayList<>() {{
                        add("Definitely one of my favourite games of all time. Very responsive, easy to learn hard to master movement that gets more fun the more you play. The game is good for both beginner players and hardcore players.");
                        add("good game");
                        add("A very overrated game with nothing too special");
                    }}));

            }});

            put(Genre.RPG, new ArrayList<>() {{
                add(new RpgGame("Baldur's Gate 3", Genre.RPG, "src/main/resources/com/project/gamecatalogue/BaldursGate3.jpg",96));
                add(new RpgGame("Fallout: New Vegas", Genre.RPG, "src/main/resources/com/project/gamecatalogue/FalloutNewVegas.jpg",84));
            }});

            put(Genre.ROGUELIKE, new ArrayList<>() {{
                //add(new RoguelikeGame("Dungeon Master", Genre.ROGUELIKE, "",11));
                add(new RoguelikeGame("The Binding of Issac Rebirth", Genre.ROGUELIKE, "src/main/resources/com/project/gamecatalogue/TheBindingofIssacRebirth.jpg",5));
            }});

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }};

    public void search(Genre genre, String name) {

    }
}
