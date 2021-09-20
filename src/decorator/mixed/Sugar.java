package decorator.mixed;

import decorator.Component;

public class Sugar extends Mixed {
    public Sugar(Component component) {
        super(component);
        setDes("糖");
        setCost(3);
    }
}
