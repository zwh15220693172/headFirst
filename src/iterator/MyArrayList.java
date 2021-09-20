package iterator;

public class MyArrayList<E> {
    private Object[] elements;
    private int size;

    public MyArrayList(int capacity){
        elements = new Object[capacity];
    }

    public MyArrayList(){
        this(16);
    }

    public void add(E e){
        elements[size++] = e;
    }

    public E get(int index){
        return (E)elements[index];
    }

    public MyIterator iterator(){
        return new MyIteratorImpl();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            Object element = elements[i];
            result += element + " ";
        }
        return result;
    }

    /**
     * 迭代器模式使用内部类的方式让迭代器更容易访问到对象
     */
    private class MyIteratorImpl<E> implements MyIterator<E>{
        private int count;

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public E next() {
            return (E)elements[count++];
        }

        @Override
        public void first() {
            this.count = 0;
        }
    }
}
