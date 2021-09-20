package adapter.objectAdapter;

import adapter.Voltage220V;
import adapter.Voltage5V;

/**
 * 对象适配器
 */
public class VoltageAdapter implements Voltage5V {
    private final Voltage220V vol;

    public VoltageAdapter(Voltage220V vol){
        this.vol = vol;
    }

    @Override
    public int output5V() {
        int src = vol.output220V();
        System.out.println("对象适配器将电压降低到5V");
        return src / 44;
    }
}
