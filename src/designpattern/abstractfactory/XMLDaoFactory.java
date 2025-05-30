package designpattern.abstractfactory;

public class XMLDaoFactory implements DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")){
            dao = new XMLEmpDao();
        }else if(type.equals("dept")){
            dao = new XMLDeptDao();
        }
        return dao;
    }
}
