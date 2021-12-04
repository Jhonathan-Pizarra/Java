/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1excepciones;

/**
 *
 * @author hp
 */
public class Excepciones {
     public static void main(String[ ] args) {
        try {
            int a[ ] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}
