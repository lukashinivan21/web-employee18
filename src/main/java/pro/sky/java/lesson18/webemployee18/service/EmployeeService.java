package pro.sky.java.lesson18.webemployee18.service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    Map<Employee, Integer> printAllEmployees();


}
