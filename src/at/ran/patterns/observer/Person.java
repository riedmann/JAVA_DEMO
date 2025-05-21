package at.ran.patterns.observer;

public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

   
    @Override
    public void info(String info) {
       System.out.println("Person " + name + " is informed that " + info + " has a speed > 100 km/h");
    }
}
