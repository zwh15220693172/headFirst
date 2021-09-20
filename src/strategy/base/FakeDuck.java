package strategy.base;

public class FakeDuck implements Duck {
    @Override
    public void swim() {
        System.out.println("假鸭子不会游泳");
    }

    @Override
    public void quack() {
        System.out.println("假鸭子唧唧叫");
    }

    @Override
    public void fly() {
        System.out.println("假鸭子不会飞");
    }
}
