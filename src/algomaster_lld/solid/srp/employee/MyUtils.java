package algomaster_lld.solid.srp.employee;

import algomaster_lld.solid.srp.student.Student;
import com.google.gson.Gson;

public class MyUtils {
    static String serializeIntoAString(Employee employee) {
        Gson gson = new Gson();
        return gson.toString();
    }
}
