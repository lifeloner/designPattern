package design.command;

/**
 * Created by fuyang on 2017/1/20.
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOff();
    }

    public void undo() {
        light.lightOn();
    }

}
