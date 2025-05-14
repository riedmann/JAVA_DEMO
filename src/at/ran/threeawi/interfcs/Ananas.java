package at.ran.threeawi.interfcs;

public class Ananas implements Product {
    private String name;
    private int price;
    private int size;

    public Ananas(String name, int price, int size) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
