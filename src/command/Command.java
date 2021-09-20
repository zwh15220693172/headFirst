package command;

public abstract class Command {
    protected final Television tv;

    public Command(Television tv){
        this.tv = tv;
    }

    public abstract void execute();
}
