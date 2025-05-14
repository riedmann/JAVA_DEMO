package at.ran.threeawi;

public class Demo {

    enum Direction {
        RIGHT, LEFT, UP
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Demo demo = new Demo();
        demo.move(Direction.RIGHT);
    }

    public void move(Direction direction) {

        if (direction == Direction.RIGHT) {
            System.out.println("Moving right");
        } else if (direction == Direction.LEFT) {
            System.out.println("Moving left");
        } else if (direction == Direction.UP) {
            System.out.println("Moving up");
        }

    }
}
