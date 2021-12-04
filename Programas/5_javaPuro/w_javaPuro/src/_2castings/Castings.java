/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2castings;

/**
 *
 * @author hp
 */
public class Castings {
    public static void main (String[] args){
        int a = (int) 3.14; //Castign explícito: yo le indico que tipo de dato reptornar, "es manual"
        System.out.println(a);
        
        double b = 42.571;
        int c = (int) b;
        System.out.println(c);
        
        int e = 5; //Casting implícito: me retorna un tipo de dato a pesar de que mis variables son de otro tipo, "es automático"
        int d = 2;
        double resp = e/d;  
        System.out.println(resp); 
        
    }
}
