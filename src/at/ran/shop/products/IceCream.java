package at.ran.shop.products;

public class IceCream implements Product {
    private String name;
    private double price;
    private String flavor;

    public IceCream(String name, double price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }
}

// primitive datatpes
// byte, short, int, long, float, double, char, boolean
