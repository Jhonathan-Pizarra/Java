/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3polimorfismo;

/**
 *
 * @author hp
 */

class Sobrecarga {
    //Another name for method overloading is compile-time polymorphism.
    
    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {     
        //Now, our max method will also work with doubles.
        //An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
    }

}