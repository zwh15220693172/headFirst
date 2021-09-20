package decorator.mixed;

import decorator.Component;

/**
 * 装饰者
 */
public class Mixed extends Component {
    private Component component;

    public Mixed(Component component){
        this.component = component;
    }

    @Override
    public String des() {
        return getDes() + ":" + getCost() + " " + component.des();
    }

    @Override
    public float cost() {
        return getCost() + component.cost();
    }
}
