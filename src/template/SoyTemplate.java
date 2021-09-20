package template;

public abstract class SoyTemplate {

    public void make(){
        prepare();
        if(withSugar()){
            sugar();
        }
        cut();
        mixed();
    }

    public void prepare(){
        System.out.println("准备大豆");
    }

    public abstract void sugar();

    public void cut(){
        System.out.println("切碎");
    }

    public void mixed(){
        System.out.println("搅拌");
    }

    /**
     * 钩子函数
     */
    public boolean withSugar(){
        return true;
    }
}
