package at.ran.staticsample;

public class Car {
    private int serialNumber;
    private static int amountOfWheels = 4;

    public Car(int serialNumber, int amountOfWheels) {
        this.serialNumber = serialNumber;

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        Car.amountOfWheels = amountOfWheels;
    }
}
