package builder;

public class HighBuilding extends AbstractBuilder {
    @Override
    public void foundation() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼建墙");
    }

    @Override
    public void buildWoof() {
        System.out.println("高楼建房顶");
    }
}
