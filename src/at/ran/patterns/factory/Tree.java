package at.ran.patterns.factory;

public class Tree implements Actor{
    private String name;

    public Tree(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("Tree is moving" + name);
    }

    public void grow(){
        System.out.println("Tree is growing");
    }

    public void cut(){
        System.out.println("Tree is cut");
    }
}
