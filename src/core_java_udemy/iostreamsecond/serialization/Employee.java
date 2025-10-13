package core_java_udemy.iostreamsecond.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = -1662022300670224623L;
    private int id;
    private String name;
    private transient int ssn; //not serialize
    private double salary;

    public Employee(int id, String name, int ssn, double salary) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ssn=" + ssn +
                ", salary=" + salary +
                '}';
    }
}
