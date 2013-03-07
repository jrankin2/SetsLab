/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setslab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import setslab.common.*;
/*
 * Using the common.Employee class from the sample project “GenericsAndSets” create
 * three Employee objects, and make sure at least two have the same social security
 * number. Now add them to a HashSet. Then loop through the HashSet and verify by 
 * running the program that, despite having the same social security number, the 
 * duplicate Employee has not been removed. Next, create the equals() and hashCode() 
 * methods in the Employee class using the Netbeans wizard. Use the SSN as the equals
 * criteria. Now run the program again and verify that this time the duplicate (the 
 * Employee with the same SSN) has been removed. Now pass the Set to a List constructor
 * and verify that your list contains the transformed Set.
 */
public class Lab1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("john", "doe", "333-33-3333");
        Employee e2 = new Employee("josh", "doe", "444-33-5555");
        Employee e3 = new Employee("john", "doe", "333-33-3333");
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        List<Employee> accessibleEmployees = new ArrayList<Employee>(employees);
        
        for (int i = 0; i < accessibleEmployees.size(); i++) {
            System.out.println(accessibleEmployees.get(i));
            
        }
        
//        for (Iterator<Employee> it = employees.iterator(); it.hasNext();) {
//            Employee emp = it.next();
//            System.out.println("emp = " + emp);
//        }
    }
}
