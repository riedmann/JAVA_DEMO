package at.ran.shop.products;

public class WaterBottle implements Product {
    private String name;
    private double price;

    public WaterBottle(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
