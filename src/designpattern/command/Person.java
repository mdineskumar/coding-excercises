package designpattern.command;

public class Person {

    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl1 = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);
        OffCommand offCommand = new OffCommand(television);

        remoteControl1.setCommand(onCommand);
        remoteControl1.pressButton();

        remoteControl1.setCommand(offCommand);
        remoteControl1.pressButton();
    }

}
