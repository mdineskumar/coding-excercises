package oop;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating instances of employees
        ManagementStaff manager1 = new ManagementStaff("M001", "Alice");
        Officer officer1 = new Officer("O001", "Bob");
        SupportingStaff supportStaff1 = new SupportingStaff("S001", "Charlie");
        ManagementStaff manager2 = new ManagementStaff("M002", "David");
        Officer officer2 = new Officer("O002", "Eve");

        List<Employee> onlineApplicants = new ArrayList<>();
        List<ITraining> trainingProgrammesApplicants = new ArrayList<>();

        trainingProgrammesApplicants.add(officer1);
        trainingProgrammesApplicants.add(officer2);
        trainingProgrammesApplicants.add(manager1);
        trainingProgrammesApplicants.add(manager2);
        //trainingProgrammesApplicants.add(supportStaff1);

        // Adding employees who can apply for leave online
        onlineApplicants.add(manager1);
        onlineApplicants.add(manager2);

        // Displaying employees applying for leave online
        System.out.println("Employees who can apply for leave online:");
        for (Employee emp : onlineApplicants) {
            emp.applyLeave();
        }

        for (ITraining emp : trainingProgrammesApplicants) {
            emp.requestTraining();
        }
    }
}


abstract class Employee{
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void applyLeave();
}

interface ITraining{
    void requestTraining();
}

class ManagementStaff extends Employee implements ITraining{

    public ManagementStaff(String employeeId, String name) {
        super(employeeId, name);
    }

    public void applyLeave() {
        System.out.println("Apply leave: thorugh online system");
    }

    public void requestTraining(){
        System.out.println(name + " (ID: " + employeeId + ") requested a training program.");

    }
}

class NormalStaff extends Employee{

    public NormalStaff(String employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public void applyLeave() {
        System.out.println("Apply leave: thorugh printed form");
    }
}

class Officer extends NormalStaff implements ITraining{

    public Officer(String employeeId, String name) {
        super(employeeId, name);
    }

    public void requestTraining(){
        System.out.println(name + " (ID: " + employeeId + ") requested a training program.");

    }
}

class SupportingStaff extends NormalStaff{

    public SupportingStaff(String employeeId, String name) {
        super(employeeId, name);
    }
}



