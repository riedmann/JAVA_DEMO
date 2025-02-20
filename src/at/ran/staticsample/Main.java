package at.ran.staticsample;

public class Main {
    public static void main(String[] xy) {
        Car car1 = new Car(1, 4);
        Car car2 = new Car(2, 4);

        car2.setAmountOfWheels(5);
        System.out.println(car2.getAmountOfWheels());

        System.out.println(car1.getAmountOfWheels());

    }
}
