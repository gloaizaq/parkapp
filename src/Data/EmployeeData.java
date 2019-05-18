/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.List;
import Model.Employee;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Loaiza
 */
public class EmployeeData { 
    private static List<Employee> employees = new ArrayList<Employee>(); 
    
    public static void addEmployee(Employee employee) {
        EmployeeData.employees.add(employee);
    }
    
    public static List<Employee> getEmployees() {
        return EmployeeData.employees;
    }
    
    public static void prueba() {
        //TODO por impletar.
    }
}
