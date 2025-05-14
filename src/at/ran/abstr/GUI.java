package at.ran.abstr;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import at.ran.abstr.entity.Entity;

public class GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Entity> entities = new LinkedList<>();

    public void run() {
        System.out.println("Welcome");

        outer: while (true) {
            System.out.println("1 Show all dogs");
            System.out.println("2 exit");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    printAllNames();
                    break;
                case 2:
                    break outer;

                default:
                    break;
            }
        }
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    private void printAllNames() {
        for (Entity entity : this.entities) {
            System.out.println(entity.getName());
        }
    }

}
