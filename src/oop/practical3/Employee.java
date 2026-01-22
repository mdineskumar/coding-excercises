package oop.practical3;

public abstract class Employee {
    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }


    abstract void applyOnline(int days);
}
