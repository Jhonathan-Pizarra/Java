/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _6algoritmos;
import java.util.Iterator;
import java.util.LinkedList;

public class Iteradores {
    public static void main(String[ ] args) {
        //An Iterator is an object that enables to cycle through a collection, obtain or remove elements.
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        //Before you can access a collection through an iterator, you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. 
        //By using this iterator object, you can access each element in the collection, one element at a time.
        Iterator<String> it = animals.iterator();
        String value = it.next();
        System.out.println(value);
        
        //Typically, iterators are used in loops. At each iteration of the loop
        LinkedList<String> machines = new LinkedList<String>();
        machines.add("fox");
        machines.add("cat");
        machines.add("dog");
        machines.add("rabbit");
        
        Iterator<String> mch = machines.iterator();
        while(mch.hasNext()) {
            String value2 = mch.next();
            System.out.println(value2);   
        }
    }
}

/*
it.next() returns the first element in the list and then moves the iterator on to the next element.
Each time you call it.next(), the iterator moves to the next element of the list.
*/