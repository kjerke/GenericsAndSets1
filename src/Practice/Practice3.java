/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinjerke
 */
public class Practice3 {
    Employee e1 = new Employee("Smith" , "Bob","333-33-3333");
     Employee e2 = new Employee("Doe" , "John","222-22-2222");
     Employee e3 = new Employee("Johnson" , "Jim","333-33-3333");
     Employee e4 = new Employee("Jone" , "Billy","222-22-2222");
     
     
     List employeeList = new ArrayList();
     employeeList.add(e1);
     
     for(Object e : employeeList) {
    Employee emp = (Employee) e;
            System.out.println(emp);
}
}
