package proxy.staticProxy;

public class TeachProxy implements Teach {
    private Teach teach;

    public TeachProxy(final Teach teach){
        this.teach = teach;
    }

    @Override
    public void teach() {
        System.out.println("教师备课");
        teach.teach();
        System.out.println("教师总结");
    }
}
