/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5maps;
import java.util.HashMap;

public class Maps {
    public static void main(String[ ] args) {
        //HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        //We have created a HashMap with Strings as its keys and Integers as its values.
        System.out.println(points.get("Dave"));  //The put, remove, and get methods are used to add, delete, and access values in the HashMap.
        //Use the get method and the corresponding key to access the HashMap elements.
    }
}