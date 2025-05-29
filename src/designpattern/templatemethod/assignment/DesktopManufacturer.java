package designpattern.templatemethod.assignment;

public class DesktopManufacturer extends ComputerManufacturer{
    @Override
    protected void addKeyboard() {
        System.out.println("add keyboard to Desktop");
    }

    @Override
    protected void addRam() {
        System.out.println("add RAM to Desktop");
    }

    @Override
    protected void addHardDisk() {
        System.out.println("add harddisk to Desktop");
    }
}
