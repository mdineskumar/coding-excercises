package designpattern.abstractfactory;

public class XMLDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving department details into xml");
    }
}
