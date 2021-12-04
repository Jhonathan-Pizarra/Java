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
public class TestAnimal {
    public static void main(String args[ ]) {
        Animal a = new Dog();
        Animal b = new Cat();
        
        a.makeSound();
        b.makeSound();
    }
}
