package at.ran.patterns.observer;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);
        Car car4 = new Car(4);
        Car car5 = new Car(5);
        
        CarManager carManager = new CarManager();
        carManager.addCar(car1);
        carManager.addCar(car2);
        carManager.addCar(car3);
        carManager.addCar(car4);
        carManager.addCar(car5);
        carManager.printAllCars();

      

        carManager.addInterested(car1);
        carManager.addInterested(car5);

        Person person1 = new Person("Max");
        Person person2 = new Person("Moritz");
        Person person3 = new Person("Peter");
        carManager.addInterested(person1);
        carManager.addInterested(person3);
        


        carManager.checkTraffic();
        carManager.checkTraffic();
    }
}
