package core_java_udemy.inheritance.com.dines.inheirtance;

public class Manager extends Employee {

    double salary;
    String[] projects;

    public Manager(int id, String name, String dept, double salary, String[] projects, double managerSalary) {
        super(id, name, dept, salary);
        this.projects = projects;
        this.salary = managerSalary;
    }

    @Override
    protected void work() {
        super.work();
        System.out.println("Manager is working on "+projects);
    }
}
