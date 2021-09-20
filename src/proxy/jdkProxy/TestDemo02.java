package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teach teach = (Teach) Proxy.newProxyInstance(teacher.getClass().getClassLoader(), teacher.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("教师教书前备课");
                method.invoke(teacher, args);
                System.out.println("教师交完总结");
                return null;
            }
        });
        teach.teach();
    }
}
