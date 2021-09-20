package adapter.interfaceAdapter;

public class TestDemo {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void function01() {
                System.out.println("只执行这个方法");
            }
        };
        abstractAdapter.function01();
    }
}
