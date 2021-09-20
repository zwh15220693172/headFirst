package flyWeight;

/**
 * 享元模式为了减少类的创建
 */
public class TestDemo {
    public static void main(String[] args) {
        FlyWeight flyWeight01 = FlyWeightFactory.createFlyWeight("战士");
        FlyWeight flyWeight02 = FlyWeightFactory.createFlyWeight("法师");
        FlyWeight flyWeight03 = FlyWeightFactory.createFlyWeight("战士");
        FlyWeight flyWeight04 = FlyWeightFactory.createFlyWeight("法师");
        flyWeight01.operation("盖伦");
        flyWeight02.operation("卡萨丁");
        flyWeight03.operation("赵兴");
        flyWeight04.operation("阿卡丽");
        System.out.println(FlyWeightFactory.size());
    }
}
