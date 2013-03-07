package setslab;

import setslab.common.Address;
import setslab.common.Dog;
import setslab.common.Employee;

public class Lab3 {
    public static void main(String[] args) {
        Address a1 = new Address("123 Easy Street", "Waukesha", "555-390-4049");
        System.out.println("a1 = " + a1);
        
        Employee e1 = new Employee("Doe", "john", "222-22-2222");
        System.out.println("e1 = " + e1);
        
        Dog d1 = new Dog("Lucifer", 1000);
        System.out.println("d1 = " + d1);
    }
}
