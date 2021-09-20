package bridge;

import bridge.brand.HuaWei;
import bridge.type.FlipPhone;
import bridge.type.FoldPhone;
import bridge.type.MobileType;

/**
 * 桥接模式，为了防止类爆炸的问题发生而使用的模式
 */
public class TestDemo {
    public static void main(String[] args) {
        MobileType flip = new FlipPhone(new HuaWei());
        System.out.println(flip.open());
        System.out.println(flip.call());
        System.out.println(flip.close());

        MobileType fold = new FoldPhone(new HuaWei());
        System.out.println(fold.open());
        System.out.println(fold.call());
        System.out.println(fold.close());
    }
}
