package strategy.good;

public class FakeDuck extends Duck {

    public FakeDuck(){
        setFly(new NoFly());
        setQuack(new JiJiQuack());
        setSwim(new NoSwim());
    }

    @Override
    public void display() {
        System.out.println("假鸭子");
        fly.fly();
        swim.swim();
        quack.quack();
    }
}
