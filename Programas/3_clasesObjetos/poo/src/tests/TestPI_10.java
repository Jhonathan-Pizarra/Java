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
public class TestPI_10 {
    //Final
    public static final double PI = 3.14;  //Use the final keyword to mark a variable constant, so that it can be assigned only once.
    //PI is now a constant. Any attempt to assign it a value will cause an error.
    public static void main(String[ ] args) {
        System.out.println(PI);
    }
}

//Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.
