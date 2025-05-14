package at.ran.threeawi.interfcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<>();

    public void run() {
        while (true) {
            System.out.println("1 show Products");
            System.out.println("2 exit");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Products");

                    for (Product product : this.products) {
                        System.out.println("Product: " + product.getName() + " Price: " + product.getPrice());
                        System.out.println(product.getClass().getName());
                    }
                    break;
                case 2:
                    System.out.println("bye");
                    System.exit(13);
                default:
                    break;
            }

        }
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
