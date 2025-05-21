package at.ran.patterns.factory;

public class Leaf implements Actor {
    private String name;
    public Leaf(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("Leaf is moving" + name);
    }
}
