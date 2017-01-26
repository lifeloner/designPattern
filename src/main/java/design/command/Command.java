package design.command;

/**
 * Created by fuyang on 2017/1/20.
 */
public interface Command {
    void execute();
    void undo();
}
