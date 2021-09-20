package factory;

public class LdCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦奶酪跟披萨");
    }

    @Override
    public void cook() {
        System.out.println("伦敦的煮3分钟");
    }

    @Override
    public void cut() {
        System.out.println("伦敦的切成3份");
    }
}
