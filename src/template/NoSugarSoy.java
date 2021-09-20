package template;

public class NoSugarSoy extends SoyTemplate {
    @Override
    public void sugar() {
        System.out.println("不要放糖");
    }

    @Override
    public boolean withSugar() {
        return false;
    }
}
