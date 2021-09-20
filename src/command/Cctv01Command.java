package command;

public class Cctv01Command extends Command {

    public Cctv01Command(Television tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.playCctv01();
    }
}
