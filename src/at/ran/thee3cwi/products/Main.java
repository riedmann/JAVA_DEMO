package at.ran.thee3cwi.products;

import at.ran.thee3cwi.products.guis.GUI;
import at.ran.thee3cwi.products.guis.GUI2;
import at.ran.thee3cwi.products.products.Car;
import at.ran.thee3cwi.products.products.Phone;
import at.ran.thee3cwi.products.products.Shoe;

public class Main {

    // dry - dont repeat yoursel
    // open close
    public static void main(String[] args) {
        GUI gui = new GUI2();
        gui.addProduct(new Shoe(null,1,"test"));
        gui.addProduct(new Shoe(null,2,"test2"));
        gui.addProduct(new Phone(1,"superphone"));
        gui.addProduct(new Car());
        gui.start();
    }
}
