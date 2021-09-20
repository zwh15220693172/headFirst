package prototype.clone;

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利",new Human());
        Sheep clone = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(clone);
    }
}
