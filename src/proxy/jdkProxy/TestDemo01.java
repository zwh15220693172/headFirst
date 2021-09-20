package proxy.jdkProxy;

public class TestDemo01 {
    public static void main(String[] args) {
        TeachProxy teachProxy = new TeachProxy(new Teacher());
        Teach proxy = teachProxy.getProxy();
        proxy.teach();
    }
}
