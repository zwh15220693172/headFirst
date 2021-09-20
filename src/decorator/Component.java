package decorator;

/**
 * 公共类
 */
public abstract class Component {
    private String des;
    private float cost;

    public abstract String des();
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
