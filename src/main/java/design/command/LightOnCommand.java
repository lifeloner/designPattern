package design.command;

/**
 * Created by fuyang on 2017/1/20.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }

    public void undo() {
        light.lightOff();
    }
}
