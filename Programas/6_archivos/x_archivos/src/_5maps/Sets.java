/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5maps;
import java.util.HashSet;

public class Sets {
    public static void main(String[ ] args) {
        //A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
    }
}
//You can use the size() method to get the number of elements in the HashSet.