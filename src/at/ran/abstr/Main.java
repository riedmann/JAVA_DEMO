package at.ran.abstr;

import at.ran.abstr.entity.AbstractEntity;
import at.ran.abstr.entity.Cat;
import at.ran.abstr.entity.Dog;
import at.ran.abstr.entity.Entity;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Peter");
        Dog d2 = new Dog("Paul");
        Dog d3 = new Dog("Hans");
        GUI gui = new GUI();
        gui.addEntity(d3);
        gui.addEntity(d1);
        gui.addEntity(d2);

        gui.run();

    }
}
