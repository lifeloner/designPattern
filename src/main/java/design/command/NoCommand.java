package design.command;

/**
 * Created by fuyang on 2017/1/20.
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("do nothing");
    }

    public void undo() {
        System.out.println("undo nothing");
    }
}
