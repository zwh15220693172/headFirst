package prototype.stream;

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利2", new Human());
        Sheep clone = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(clone);
    }
}
