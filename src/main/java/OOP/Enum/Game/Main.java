package OOP.Enum.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("Last of Us Part", 2020, GamePlatform.PLAYSTATION);
        game.platform();
        Game game1 = new Game("Last of Us Part 2", 2022, GamePlatform.PC);
        game1.platform();

        Game game2 = new Game("Age of Impairs", 2020, GamePlatform.PLAYSTATION,GamePlatform.PC);


        System.out.println(game.equals( game2));
    }
}
