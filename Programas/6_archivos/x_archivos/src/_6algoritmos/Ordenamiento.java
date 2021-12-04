/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _6algoritmos;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {
    public static void main(String[ ] args) {
        //One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. 
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        //One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. 
        Collections.sort(animals);
       
        System.out.println(animals); //As you can see, the elements have been sorted alphabetically.
    }
}