package at.ran.patterns.observer;

public class Car implements Observer {
    private int speed;
    private int serial;

    public Car(int serial) {
        this.serial = serial;
    }

    public int getSerial() {
        return serial;

    }
    public int getSpeed() {
        return speed;
    }

  

    @Override
    public void info(String info) {
       
       
       System.out.println("Car " + serial + " is speeding up!");
    }
}
