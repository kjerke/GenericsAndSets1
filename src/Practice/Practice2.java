/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        
        set.add("Beer");
        set.add("Chips");
        set.add("Vodka");
        set.add("Beer");
        
        String s = set.get(2);
        
        set.add(2, "Bourbon");
        set.remove(1);
        
        for(String item : set) {
            System.out.println(item);
        }
    }
}
