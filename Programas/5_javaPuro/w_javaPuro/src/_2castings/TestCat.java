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
public class TestCat {
    public static void main(String[] arg){
        //castign de clases
        Animal a = new Cat();
        ((Cat)a).makeSound(); 
    }
}
