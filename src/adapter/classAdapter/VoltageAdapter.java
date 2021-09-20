package adapter.classAdapter;

import adapter.Voltage220V;
import adapter.Voltage5V;

/**
 * 类适配器
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("类适配器将电压降低到5V");
        return src / 44;
    }
}
