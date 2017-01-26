package design.command;

/**
 * Created by fuyang on 2017/1/20.
 */
public class RemoteControl {

    private Command[]onCommands;
    private Command[]offCommands;
    private Command undoCommand;
    public RemoteControl(){
        onCommands=new Command[3];
        offCommands=new Command[3];
        Command command=new NoCommand();
        for(int i=0;i<3;i++){
            onCommands[i]=command;
            offCommands[i]=command;
        }
        undoCommand=command;
    }

    public void setCommands(int index,Command onCommand,Command offCommand){
        onCommands[index]=onCommand;
        offCommands[index]=offCommand;
    }

    public void onButtonPressed(int index){
        onCommands[index].execute();
        undoCommand=onCommands[index];
    }

    public void offButtonPressed(int index){
        offCommands[index].execute();
        undoCommand=offCommands[index];
    }

    public void undoCommand(){
        undoCommand.undo();
    }


    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();
        Light light=new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);
        Command []onCommands={lightOnCommand};
        Command []offCommands={lightOffCommand};
        MacroCommand macroOnCommand=new MacroCommand(onCommands);
        MacroCommand macroOffCommand=new MacroCommand(offCommands);
        remoteControl.setCommands(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommands(1,macroOnCommand,macroOffCommand);
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.undoCommand();
        remoteControl.undoCommand();
    }
}
