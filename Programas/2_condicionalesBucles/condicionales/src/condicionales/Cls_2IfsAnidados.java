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
public class Cls_2IfsAnidados {
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 25;
        if(age > 0) {
            if(age > 16) { //You can nest as many if-else statements as you want
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }
    }
   
}
