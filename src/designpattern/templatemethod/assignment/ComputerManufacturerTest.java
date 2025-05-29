package designpattern.templatemethod.assignment;

public class ComputerManufacturerTest {
    public static void main(String[] args) {
        ComputerManufacturer desktopManufacturer = new DesktopManufacturer();
        ComputerManufacturer laptopManufacturer = new LaptopManufacturer();

        desktopManufacturer.buildComputer();
        laptopManufacturer.buildComputer();
    }
}
