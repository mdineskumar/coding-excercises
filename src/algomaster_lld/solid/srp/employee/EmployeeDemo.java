package algomaster_lld.solid.srp.employee;

import core_java_udemy.access_modifiers.p1.p3.E;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId("10001");
        employee.setEmployeeAddress("Jaffna");
        employee.setEmployeeType("fulltime");
        employee.setContactNumber("0868982");
        employee.setEmployeeName("test00");
        employee.save();
    }
}
