package command;
import java.util.LinkedList;

public class TvController {
    private LinkedList<Command> list;

    public TvController(){
        list = new LinkedList<>();
    }

    public void switchTv(Command command){
        list.push(command);
        command.execute();
    }

    public void rollback(){
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 2) {
            list.pop();
        }
        Command pop = list.pop();
        pop.execute();
    }
}
