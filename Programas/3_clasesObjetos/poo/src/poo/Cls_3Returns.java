/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author hp
 */
public class Cls_3Returns {
    static int sum(int val1, int val2) {
        return val1 + val2;
    }
    //When you do not need to return any value from your method, use the keyword void
    //Notice the void keyword in the definition of the main method - this means that main does not return anything.
    public static void main(String[ ] args) {
        int x = sum(2, 5);
        System.out.println(x);
        
        int res = max(7, 42);
        System.out.println(res);
    }
    
    //Convencionalmente se establecen estos métodos bajo del main, como las funciones hacen en C/C++
      static int max(int a, int b) {
        if(a > b) {
          return a;
        }
        else {
            return b;
        }
    }
}
