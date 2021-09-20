package flyWeight;

import java.util.HashMap;

/**
 * 享元模式，为了减少内存的损耗
 */
public class FlyWeightFactory {
    private final static HashMap<String,FlyWeight> elements = new HashMap<>();

    public static FlyWeight createFlyWeight(String type){
        if (elements.containsKey(type)) {
            return elements.get(type);
        } else {
            FlyWeight flyWeight = new AbstractFlyWeight(type);
            elements.put(type,flyWeight);
            return flyWeight;
        }
    }

    public static int size(){
        return elements.size();
    }
}
