package algomaster_lld.solid.dip;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository{


    @Override
    public List<String> getAllProductNames() {
        return Arrays.asList("soap","toothpaste");
    }
}
