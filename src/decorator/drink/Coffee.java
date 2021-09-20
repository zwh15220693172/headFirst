package decorator.drink;

import decorator.Component;

/**
 * 被装饰者
 */
public class Coffee extends Component {

    public Coffee(){
        setDes("咖啡");
        setCost(20);
    }

    @Override
    public String des() {
        return getDes() + ":" + getCost();
    }

    @Override
    public float cost() {
        return getCost();
    }
}
