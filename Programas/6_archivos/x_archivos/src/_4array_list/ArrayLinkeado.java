/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4array_list;
import java.util.LinkedList;

public class ArrayLinkeado {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>(); //You cannot specify an initial capacity for the LinkedList.
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);
    }
}

