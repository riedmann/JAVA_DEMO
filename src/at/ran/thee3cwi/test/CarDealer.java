package at.ran.thee3cwi.test;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void printVehicles(){
        for (Vehicle v:this.vehicles) {
            System.out.println("Id:" + v.getID() + " Name: " + v.getName());
        }
    }
}
