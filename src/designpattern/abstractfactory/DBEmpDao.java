package designpattern.abstractfactory;

public class DBEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving employee details into db");
    }
}
