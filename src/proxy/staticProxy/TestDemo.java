package proxy.staticProxy;

/**
 * ้ๆไปฃ็
 */
public class TestDemo {
    public static void main(String[] args) {
        Teach teacher = new TeachProxy(new Teacher());
        teacher.teach();
    }
}
