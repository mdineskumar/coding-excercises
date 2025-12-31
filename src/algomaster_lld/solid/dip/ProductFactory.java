package algomaster_lld.solid.dip;

public class ProductFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
