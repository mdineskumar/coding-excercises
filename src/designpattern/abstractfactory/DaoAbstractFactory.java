package designpattern.abstractfactory;

public interface DaoAbstractFactory {
    Dao createDao(String type);
}
