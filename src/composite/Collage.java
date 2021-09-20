package composite;

import java.util.ArrayList;

public class Collage extends Composite {
    private ArrayList<Composite> list;

    public Collage(String name) {
        super(name);
        list = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("----------"+getName()+"----------");
        for (int i = 0; i < list.size(); i++) {
            Composite composite = list.get(i);
            composite.print();
        }
    }

    @Override
    public void add(Composite composite) {
        list.add(composite);
    }

    @Override
    public void remove(Composite composite) {
        list.remove(composite);
    }
}
