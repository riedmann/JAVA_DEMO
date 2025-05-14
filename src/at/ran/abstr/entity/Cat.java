package at.ran.abstr.entity;

public class Cat extends AbstractEntity {

    public Cat() {
        super("hanbsi");
    }

    public void doMiau() {
        System.out.println("Miau");
    }

    @Override
    public void sayHello() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sayHello'");
    }

}
