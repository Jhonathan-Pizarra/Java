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
public class Counter {
    //Static
    public static int COUNT=0; //When you declare a variable or a method as static, it belongs to the class,
    // This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.
    //The COUNT variable will be shared by all objects of that class.
    
    //It’s a common practice to use upper case when naming a static variable, although not mandatory.
    
    
    Counter() {
        COUNT++;
    }
}
