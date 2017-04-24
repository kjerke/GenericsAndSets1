/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        
      Address address = new Address():
      
      address.setAddress1("1234 Street");
      address.setCity("Milwaukee");
      address.setState("WI");
      address.setZipCode("53072");
      address.setEmail("bob11@gmail.com");
      address.setPhone("414-111-1111");
      
      Address address2 = new Address();
      
      address2.setAddress1("1234 Street");
      address2.setCity("Milwaukee");
      address2.setState("WI");
      address2.setZipCode("53072");
      address2.setEmail("bob11@gmail.com");
      address2.setPhone("414-111-1111");
      
      


      List<Address> addresses = new ArrayList<>();
      if(address.getCity().equals("Milwaukee")) {
          addresses.add(address);
      }
      if(address2.add(address));
      
      addresses.add(address2);
      
      for(Address a : addresses){
          
      }

//      if(address.equals(address2)) {
//          System.out.println("The addresses are the same");
//      } else {
//          System.out.println("The addresses are NOT the same");
//      }
//        
//        ArrayList<String> list = new ArrayList<>();
//        
//        list.add("Beer");
//        list.add("Chips");
//        list.add("Vodka");
//        list.add("Beer");
//        list.add("Beer");
//        
//        
        Set<Address> noDupes = new HashSet<>();
        noDupes.add(address);
        noDupes.add(address2);
        
        for(Address a : noDupes) {
            System.out.println(a);
     }
    }
}
