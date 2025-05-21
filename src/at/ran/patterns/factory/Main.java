package at.ran.patterns.factory;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();

        for (int i = 0; i < 10; i++) {
            game.addActor(ActorFactory.getActorRandomActor());
        }
       
        game.startGame();
        
    }
}
