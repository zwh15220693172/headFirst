package builder;

/**
 * 指挥者
 */
public class Director {
    private AbstractBuilder abstractBuilder;

    /**
     * 通过聚合的关系让指挥者与抽象建造者建立关系
     */
    public Director(final AbstractBuilder abstractBuilder){
        this.abstractBuilder = abstractBuilder;
    }

    /**
     * 具体怎么建造由指挥者来决定
     * @return
     */
    public House constructHouse(){
        abstractBuilder.foundation();
        abstractBuilder.buildWall();
        abstractBuilder.buildWoof();
        return abstractBuilder.buildHouse();
    }
}
