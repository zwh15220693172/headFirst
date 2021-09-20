package composite;

/**
 * composite
 */
public abstract class Composite {
    private String name;
    public Composite(final String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void print();
    public abstract void add(Composite composite);
    public abstract void remove(Composite composite);
}
