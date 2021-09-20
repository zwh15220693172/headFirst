package factory;

public class ChPepperPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备中国的胡椒跟披萨");
    }

    @Override
    public void cook() {
        System.out.println("中国煮5分钟");
    }

    @Override
    public void cut() {
        System.out.println("中国切成5份");
    }
}
