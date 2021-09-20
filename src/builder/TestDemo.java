package builder;

/**
 * 建造者模式是为了建产品本身与制造流程分离开来
 */
public class TestDemo {
    public static void main(String[] args) {
        HighBuilding highBuilding = new HighBuilding();
        Director director = new Director(highBuilding);
        House house = director.constructHouse();
    }
}
