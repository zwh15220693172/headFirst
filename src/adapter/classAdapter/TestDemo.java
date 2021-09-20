package adapter.classAdapter;

import adapter.Phone;

public class TestDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
