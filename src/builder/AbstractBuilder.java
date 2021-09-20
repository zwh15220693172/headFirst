package builder;

/**
 * 抽象建造者
 */
public abstract class AbstractBuilder {
    public abstract void foundation();
    public abstract void buildWall();
    public abstract void buildWoof();
    public House buildHouse(){
        return new House();
    }
}
