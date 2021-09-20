package proxy.staticProxy;

public class Teacher implements Teach {
    @Override
    public void teach() {
        System.out.println("教师教书");
    }
}
