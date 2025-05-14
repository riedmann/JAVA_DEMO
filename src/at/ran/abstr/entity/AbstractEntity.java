package at.ran.abstr.entity;

public abstract class AbstractEntity implements Entity {
    private String name;

    public AbstractEntity(String name) {
        this.name = name;
    }

    @Override
    public String getName() {

        return this.name;
    }
}
