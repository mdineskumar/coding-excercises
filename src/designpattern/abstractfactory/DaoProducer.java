package designpattern.abstractfactory;

public class DaoProducer {
    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daf = null;

        if(factoryType.equals("xml")){
            daf = new XMLDaoFactory();
        } else if (factoryType.equals("db")) {
            daf = new DBDaoFactory();
        }
        return daf;
    }
}
