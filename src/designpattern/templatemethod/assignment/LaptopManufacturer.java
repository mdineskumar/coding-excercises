package designpattern.templatemethod.assignment;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    protected void addKeyboard() {
        System.out.println("add keyboard to Laptop");
    }

    @Override
    protected void addRam() {
        System.out.println("add RAM to laptop");
    }

    @Override
    protected void addHardDisk() {
        System.out.println("add harddisk to laptop");
    }
}
