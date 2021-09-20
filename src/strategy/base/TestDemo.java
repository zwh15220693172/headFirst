package strategy.base;

public class TestDemo {
    public static void main(String[] args) {
        Duck fakeDuck = new FakeDuck();
        fakeDuck.fly();
        fakeDuck.quack();
        fakeDuck.swim();
    }
}
