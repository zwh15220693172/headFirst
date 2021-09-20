package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeachProxy implements InvocationHandler {
    private Teach teach;

    public TeachProxy(Teach teach){
        this.teach = teach;
    }

    public Teach getProxy(){
        return (Teach) Proxy.newProxyInstance(teach.getClass().getClassLoader(),teach.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("教师备课");
        method.invoke(teach,args);
        System.out.println("教师总结");
        return null;
    }
}
