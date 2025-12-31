package algomaster_lld.solid.isp;

public class HPPrintNScanner implements IPrint, IScan
//        IMultiFunction
{
    @Override
    public void print() {
        System.out.println("HPPrintNScanner: print()");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("HPPrintNScanner: print()");

    }

    @Override
    public void scan() {
        System.out.println("HPPrintNScanner: print()");

    }

    @Override
    public void scanPhoto() {
        System.out.println("HPPrintNScanner: scanPhoto()");
    }

//    @Override
//    public void fax() {
//        throw new RuntimeException("fax() No Implementation");
//
//    }
//
//    @Override
//    public void internetFax() {
//        throw new RuntimeException("internetFax() No Implementation");
//
//    }
}
