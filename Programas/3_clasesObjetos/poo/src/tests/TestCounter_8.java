/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author hp
 */
public class TestCounter_8 {
     public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT); //The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of the Counter class is created. 
        //And we created 2 objects
        //You can also access the static variable using any object of that class, such as c1.COUNT.
    }
}
