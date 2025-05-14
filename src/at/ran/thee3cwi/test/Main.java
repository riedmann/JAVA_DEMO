package at.ran.thee3cwi.test;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 1);

        System.out.println("Car Name: " + car.getName());
        System.out.println("Car ID: " + car.getID());
        car.drive();

        CarDealer dealer = new CarDealer();
        dealer.addVehicle(car);
        dealer.addVehicle(new Car("BMW",4));
        dealer.addVehicle(new Train("SuperTrain",55));

        dealer.printVehicles();

    }
}
