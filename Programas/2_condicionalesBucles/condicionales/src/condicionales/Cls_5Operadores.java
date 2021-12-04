/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author hp
 */
public class Cls_5Operadores {
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 22;
        int money = 800;
        
        //Operadores de Comparación
        // >, <, <=, >=, ==
        if (age > 18) {
            if (money > 500) {
                System.out.println("Welcome!");
            }
        }
        
        //Operadores lógicos
        // &&, ||, !=, !
        if (age > 18 && money > 500) {
            System.out.println("And!");
        }
        
        if (age > 18 || money > 500) {
            System.out.println("Or!");
        }
        
        if(!(age > 18)) { //!(age > 18) reads as "if age is NOT greater than 18".
            System.out.println("Operador !");
        } else {
            System.out.println("Welcome");
        }
    }
}
