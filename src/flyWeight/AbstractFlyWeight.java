package flyWeight;

/**
 * 抽象享元对象
 */
public class AbstractFlyWeight implements FlyWeight{
    private String type;

    public AbstractFlyWeight(final String type){
        this.type = type;
    }

    @Override
    public void operation(String name) {
        System.out.println("类型：" + type + " 名字:" + name);
    }
}
