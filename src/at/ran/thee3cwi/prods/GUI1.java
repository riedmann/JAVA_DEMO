package at.ran.thee3cwi.prods;

import java.util.ArrayList;
import java.util.List;

public class GUI1 implements GUI {

    private List<Product> products = new ArrayList<>();

    @Override
    public void start() {
        System.out.println("press 1) for ....");
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }
}
