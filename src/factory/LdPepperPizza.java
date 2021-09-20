package factory;

public class LdPepperPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦的胡椒跟披萨");
    }

    @Override
    public void cook() {
        System.out.println("伦敦的煮5分钟");
    }

    @Override
    public void cut() {
        System.out.println("伦敦的切成5份");
    }
}
