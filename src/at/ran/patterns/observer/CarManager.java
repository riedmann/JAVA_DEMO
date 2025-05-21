package at.ran.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarManager {
    private List<Car> cars = new ArrayList<>();
    private List<Observer> intersted = new ArrayList<>(); // cars with speed > 100 km/h

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addInterested(Observer observer) {
        intersted.add(observer);
    }

    public void printAllCars() {
        for (Car car : cars) {
            System.out.println(car.getSerial());
        }
    }

    public void checkTraffic(){
        Random random = new Random();
        boolean traffic = random.nextBoolean();
        System.out.println("traffic: " + traffic);

        if (traffic){
            for (Observer observer : intersted) {
               observer.info("high traffic d");
            }
        }
    }
}
