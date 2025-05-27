package designpattern.abstractfactory;

public class XMLEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving employee to XML");
    }
}
