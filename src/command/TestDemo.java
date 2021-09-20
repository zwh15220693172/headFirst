package command;

public class TestDemo {
    public static void main(String[] args) {
        Television tv = new Television();
        TvController tvController = new TvController();
        tvController.switchTv(new Cctv01Command(tv));
        tvController.switchTv(new Cctv02Command(tv));
        tvController.switchTv(new Cctv03Command(tv));
        tvController.rollback();
        tvController.rollback();
        tvController.rollback();
    }
}
