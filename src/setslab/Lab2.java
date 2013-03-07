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
import setslab.common.Address;

/**
 *
 * @author jrankin2
 */
public class Lab2 {
    public static void main(String[] args) {
        Address a1 = new Address("123 Easy Street", "Waukesha", "555-349-9498");
        Address a2 = new Address("1111 East Street", "Waukesha", "555-293-2764");
        Address a3 = new Address("123 Easy Street", "Waukesha", "555-349-9498");
        
        Set<Address> addresses = new HashSet<Address>();
        List<Address> accessibleAddresses = new ArrayList<Address>(addresses);
        
        for (Address address : accessibleAddresses) {
            System.out.println("address = " + address);
        }
        
        for (Iterator<Address> it = accessibleAddresses.iterator(); it.hasNext();) {
            Address address = it.next();
            System.out.println("address = " + address);
        }
        
    }
}
