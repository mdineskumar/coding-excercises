package algomaster_lld.solid.srp.student;

import java.util.Date;


//changes to student profile
public class Student {
    private String studentId;
    private String address;
    private Date studentDOB;

    public void save() {

        new StudentRepository().save(this);
//        //serialize object into a string representation
//        String objectStr = MyUtils.serializeIntoAString(this);
//        Connection connection = null;
//        Statement stmt = null;
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root","password"); // need to setup MYSQL database
//            stmt = connection.createStatement();
//            stmt.execute("INSERT INTO STUDENT VALUEs ("+objectStr+")");
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }
}
