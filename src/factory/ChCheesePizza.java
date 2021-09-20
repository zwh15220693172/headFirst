package factory;

public class ChCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备中国的奶酪跟披萨");
    }

    @Override
    public void cook() {
        System.out.println("中国煮3分钟");
    }

    @Override
    public void cut() {
        System.out.println("中国切成3份");
    }
}
