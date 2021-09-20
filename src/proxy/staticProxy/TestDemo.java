package proxy.staticProxy;

/**
 * 静态代理
 */
public class TestDemo {
    public static void main(String[] args) {
        Teach teacher = new TeachProxy(new Teacher());
        teacher.teach();
    }
}
