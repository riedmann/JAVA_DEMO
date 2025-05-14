package at.ran.thee3cwi.prods;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI1();
        gui.addProduct(new Shoe(1,"test"));
        gui.addProduct(new Shoe(2,"Sneaker"));
        gui.addProduct(new Shoe(3,"Nobel"));

        gui.start();
    }
}
