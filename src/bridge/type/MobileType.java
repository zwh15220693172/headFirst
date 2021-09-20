package bridge;

/**
 * 这就是桥，使用抽象类代替继承的关系
 */
public abstract class MobileType {
    private final Brand brand;

    public MobileType(Brand brand){
        this.brand = brand;
    }

    public abstract String display();

    public String call(){
        return display() + brand.call();
    }

    public String open(){
        return display() + brand.open();
    }

    public String close(){
        return display() + brand.close();
    }
}
