package adapter.objectAdapter;

import adapter.Phone;
import adapter.Voltage220V;

public class TestDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
