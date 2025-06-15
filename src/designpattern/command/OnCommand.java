package designpattern.command;

public class OnCommand implements Command{
    Television television;

    public OnCommand(Television television){
        this.television = television;
    }
    @Override
    public void execute() {
        television.on();
        System.out.println("On command executing on");
    }
}
