package oop.practical3;

public class NormalStaff extends Employee{

    public NormalStaff(String employeeId) {
        super(employeeId);
    }

    @Override
    void applyOnline(int days) {
        System.out.println("Normal Staff "+employeeId + " applying for "+days+" days leave via PRINTED FORM.");
    }
}
