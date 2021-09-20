package composite;

public class Department extends Composite {
    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("- - - - - - -"+getName()+" - - - - - - -");
    }

    @Override
    public void add(Composite composite) {
    }

    @Override
    public void remove(Composite composite) {
    }
}
