package template;

/**
 * 模板模式
 */
public class TestDemo {
    public static void main(String[] args) {
        SoyTemplate sugarSoy = new SugarSoy();
        sugarSoy.make();
        System.out.println("=============================");
        SoyTemplate noSugarSoy = new NoSugarSoy();
        noSugarSoy.make();
    }
}
