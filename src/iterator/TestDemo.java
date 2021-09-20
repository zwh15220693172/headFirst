package iterator;

/**
 * 迭代器模式为了不访问对象的情况下知道内部元素组成
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+"");
        }
        System.out.println(list);
        MyIterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
