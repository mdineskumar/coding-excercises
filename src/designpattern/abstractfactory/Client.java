package designpattern.abstractfactory;

public class Client {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoProducer.produce("xml");
        Dao dao = daf.createDao("emp");
        dao.save();

        dao = daf.createDao("dept");
        dao.save();
    }
}
