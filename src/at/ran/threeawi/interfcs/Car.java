package at.ran.threeawi.interfcs;

public class Car implements Product {
    // Kapselung
    private String name;
    private int price;
    private int hp;

    public Car(String name, int price, int hp) {
        this.name = name;
        this.price = price;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
