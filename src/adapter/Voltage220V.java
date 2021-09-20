package adapter;

/**
 * 适配器模式，为了将两个不相干的类联系到一起而使用
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("当前电压为220V");
        return src;
    }
}
