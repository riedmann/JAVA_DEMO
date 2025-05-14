package at.ran.thee3cwi.prods;

public class Shoe implements Product{
    private int id;
    private String title;

    public Shoe(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
