package core_java_udemy.inheritance.com.dines.inheirtance;

public class Employee {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    protected void work(){
        System.out.println("COmmon work for everyone");
    }
}
