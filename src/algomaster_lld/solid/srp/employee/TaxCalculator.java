package algomaster_lld.solid.srp.employee;

public class TaxCalculator {
    public void calculateTax(Employee employee) {
        System.out.println("Calculating Tax in Calculator Class");
        if (employee.getEmployeeType().equalsIgnoreCase("fulltime")) {
            //Tax calc for full time employee
        } else if (employee.getEmployeeType().equalsIgnoreCase("contract")) {
            //tax calc for contractors
        }
    }
}
