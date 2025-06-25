package core_java_udemy.innerclasses.anonymousinnerclasses;

public class DriverManager {
    public static Connection getConnection(){
        Connection con = new Connection() {
            @Override
            public void createStatement() {
                System.out.println("Anonymous inner class method");
            }
        };
        return con;
    }
}
