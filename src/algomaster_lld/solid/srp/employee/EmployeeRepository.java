package algomaster_lld.solid.srp.employee;

import algomaster_lld.solid.srp.student.Student;

import java.sql.*;

public class EmployeeRepository {

    public void save(Employee employee) {
        //serialize object into a string representation
        String objectStr = MyUtils.serializeIntoAString(employee);
        Connection connection = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "root"); // need to setup MYSQL database
            String sql = "INSERT INTO EMPLOYEE (employeeId, employeeName, employeeAddress, contactNumber, employeeType) VALUES (?,?,?,?,?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, employee.getEmployeeId());
            pstmt.setString(2, employee.getEmployeeName());
            pstmt.setString(3, employee.getEmployeeAddress());
            pstmt.setString(4, employee.getContactNumber());
            pstmt.setString(5, employee.getEmployeeType());

            pstmt.executeUpdate();

            System.out.println("Employee is saved!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
