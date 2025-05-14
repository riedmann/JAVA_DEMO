package at.ran.threeawi.interfcs;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.addProduct(new Car("Babay", 5000, 100));
        gui.addProduct(new Car("Buba", 6000, 110));
        gui.addProduct(new Car("Xüy", 7000, 120));
        gui.addProduct(new Ananas("Sweety", 10, 100));
        gui.addProduct(new Tree());

        gui.run();
    }
}
