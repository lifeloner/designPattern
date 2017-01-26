package design.command;

/**
 * Created by fuyang on 2017/1/20.
 */
public class SimpleRemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed(){
        command.execute();
    }

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();
    }
}
