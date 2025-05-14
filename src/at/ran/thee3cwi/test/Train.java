package at.ran.thee3cwi.test;

public class Train implements Vehicle{
    private String name;
    private int ID;

    public Train (String name, int id){
        this.name = name;
        this.ID = id;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public void drive() {
        System.out.println("Train is driving");
    }
}
