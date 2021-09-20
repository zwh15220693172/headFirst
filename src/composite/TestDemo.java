package composite;

public class TestDemo {
    public static void main(String[] args) {
        University university = new University("清华大学");
        Collage collage = new Collage("化学工程学院");
        university.add(collage);
        Department department = new Department("高数");
        Department department01 = new Department("英语");
        Department department02 = new Department("化学");
        Department department03 = new Department("物理");
        collage.add(department);
        collage.add(department01);
        collage.add(department02);
        collage.add(department03);
        university.print();
    }
}
