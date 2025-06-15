package designpattern.templatemethod.assignment;

public abstract class ComputerManufacturer {

    public void buildComputer(){

        addHardDisk();
        addRam();
        addKeyboard();

        System.out.println("build computer finished");
    }

    protected abstract void addKeyboard();

    protected abstract void addRam();

    protected abstract void addHardDisk();
}
