package strategy.good;

public class JiJiQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("唧唧叫");
    }
}
