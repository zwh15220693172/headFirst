package adapter;

/**
 * 适配器模式为了将两个不相干的类联系在一起
 */
public class Phone {
    public void charging(Voltage5V vol){
        if (vol.output5V() == 5) {
            System.out.println("电压合适开始充电");
        }
    }
}
