package strategy.good;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
