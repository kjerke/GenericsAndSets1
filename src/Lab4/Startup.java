/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import Lab3.*;
import Lab2.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kevinjerke
 */
public class Startup {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith", "John", "123456789"));
        employees.add(new Employee("Doe", "Robby", "987654321"));
        employees.add(new Employee("Johnson", "Jim", "1597538624"));
        employees.add(new Employee("Hartford", "Sally", "123456789"));
        employees.add(new Employee("Smith", "John", "123456789"));
 
        Set<Employee>employees2 = new LinkedHashSet<>(employees);
        
        employees = new ArrayList(employees2);
        
        System.out.println("List after removing duplicates using hashSet");
        for (Employee s : employees) {
            System.out.println(s);
        }
    }

    }
