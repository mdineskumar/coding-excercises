package algomaster_lld.solid.isp;

public class CannonPrinter implements IPrint
//        IMultiFunction
{
    @Override
    public void print() {
        System.out.println("CannonPrinter: print()");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("CannonPrinter: getPrintSpoolDetails()");
    }
// we dont need this
//    @Override
//    public void scan() {
//        throw new RuntimeException("scan() No Implementation");
//    }
//
//    @Override
//    public void scanPhoto() {
//        throw new RuntimeException("scanPhoto() No Implementation");
//    }
//
//    @Override
//    public void fax() {
//        throw new RuntimeException("fax() No Implementation");
//    }
//
//    @Override
//    public void internetFax() {
//        throw new RuntimeException("internetFax() No Implementation");
//    }
}
