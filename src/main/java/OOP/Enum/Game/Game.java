package OOP.Enum.Game;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final String title;
    private final int releaseYear;
    private final List<GamePlatform> platforms;


    public Game(String title, int releaseYear, GamePlatform... platforms) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.platforms = List.of(platforms);
    }


    public List<GamePlatform> platform() {
        System.out.println(title);
        System.out.println(releaseYear);
        for (GamePlatform platform : platforms) {
            System.out.println(platform);
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        Game gameObj = (Game) obj;
        return this.title.equals(gameObj.title);//this.title.equals(((Game) obj).title)
    }
}
