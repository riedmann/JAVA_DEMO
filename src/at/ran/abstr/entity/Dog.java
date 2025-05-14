package at.ran.abstr.entity;

public class Dog implements Entity {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {

        System.out.println("wuff");
    }

    @Override
    public void sayHello() {
        bark();
    }
}
