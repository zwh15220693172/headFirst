package decorator.mixed;

import decorator.Component;

public class Milk extends Mixed {
    public Milk(Component component) {
        super(component);
        setDes("牛奶");
        setCost(5);
    }
}
