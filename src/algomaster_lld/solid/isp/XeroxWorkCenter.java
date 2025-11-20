package algomaster_lld.solid.isp;

public class XeroxWorkCenter implements IScan, IPrint, IFax
//        IMultiFunction
{

    @Override
    public void print() {
        System.out.println("Xerox Print");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Xerox getPrintSpoolDetails()");
    }

    @Override
    public void scan() {
        System.out.println("Xerox scan()");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Xerox scanPhoto()");
    }

    @Override
    public void fax() {
        System.out.println("Xerox fax()");
    }

    @Override
    public void internetFax() {
        System.out.println("Xerox internetFax");
    }
}
