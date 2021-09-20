package command;

public class Cctv03Command extends Command{

    public Cctv03Command(Television tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.playCctv03();
    }
}
