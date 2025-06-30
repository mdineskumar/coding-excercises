package core_java_udemy.collections.sortingobjects;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Employee o) {
        int id1 = this.id;
        int id2 = o.id;
        return Integer.compare(id2, id1);
    }
}
