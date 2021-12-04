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
public class Cls_4Else_If {
     public static void main(String[] args) {
        // TODO code application logic here
        int age = 25;
        if(age <= 0) {
            System.out.println("Error");
        } else if(age <= 16) { //You can include as many else if statements as you need.
            System.out.println("Too Young");
        } else if(age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
    }
}
