package at.ran.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import at.ran.shop.products.Book;
import at.ran.shop.products.IceCream;
import at.ran.shop.products.Product;
import at.ran.shop.products.WaterBottle;

public class GUI {
    private Scanner scanner = new Scanner(System.in);

    private List<Product> products = new ArrayList<>();;

    public GUI() {
        init();
    }

    private void init() {
        WaterBottle bottle1 = new WaterBottle("Bottle 1", 10.0);
        WaterBottle bottle2 = new WaterBottle("Bottle 2", 20.0);
        WaterBottle bottle3 = new WaterBottle("Bottle 3", 30.0);

        products.add(bottle1);
        products.add(bottle2);
        products.add(bottle3);

        IceCream iceCream1 = new IceCream("Ice Cream 1", 5.0, "Vanilla");
        IceCream iceCream2 = new IceCream("Ice Cream 2", 10.0, "Chocolate");
        IceCream iceCream3 = new IceCream("Ice Cream 3", 15.0, "Strawberry");

        products.add(iceCream1);
        products.add(iceCream2);
        products.add(iceCream3);

        Book book1 = new Book("Book 1", 10.0);
        Book book2 = new Book("Book 2", 20.0);
        Book book3 = new Book("Book 3", 30.0);

        products.add(book1);
        products.add(book2);

    }

    public void run() {
        System.out.println("Hello, World!");
        System.out.println("This is the shop GUI");

        while (true) {
            System.out.println("1. Show Products");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    printProducts();

                    break;

                default:
                    break;
            }

            // Get user input
            // If user input is 1, call addItemToCart()
            // If user input is 2, call removeItemFromCart()
            // If user input is 3, call viewCart()
            // If user input is 4, call checkout()
            // If user input is 5, exit the program
        }
    }

    private void printProducts() {

        for (Product product : this.products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

    }
}
