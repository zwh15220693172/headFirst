package singleton.type1;

/**
 * 饿汉式
 */
public class SingleTon {
    private final static SingleTon instance = new SingleTon();

    private SingleTon(){
    }

    public static SingleTon getInstance(){
        return instance;
    }
}
