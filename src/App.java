import java.io.IOException;

import game.Game;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");

        Game game = new Game();
        game.run();
    }
}
