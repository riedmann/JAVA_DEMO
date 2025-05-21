package at.ran.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Actor> actors = new ArrayList<>();

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public void startGame() throws InterruptedException{
        while(true){
            for (Actor actor : actors) {
              actor.move();
            }
            Thread.sleep(100);
          }
    }
}
