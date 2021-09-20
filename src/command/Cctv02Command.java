package command;

public class Cctv02Command extends Command {
    public Cctv02Command(Television tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.playCctv02();
    }
}
