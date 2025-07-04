package core_java_udemy.collections.sortingobjects;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortingObjectTest {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>(new EmployeeNameComparator());
        employeeSet.add(new Employee(100,"Obama"));
        employeeSet.add(new Employee(23,"Lisa"));
        employeeSet.add(new Employee(45,"Ausa"));
        employeeSet.add(new Employee(124,"Kawsa"));

        for (Employee employee :
                employeeSet) {
            System.out.println(employee.id);
            System.out.println(employee.name);
        }



    }
}
