/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1interfaces;

/**
 *
 * @author hp
 */
class Cat implements Animal { //When you implement an interface, you need to override all of its methods.
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    @Override
    public void eat() {
        System.out.println("omnomnom");
    }
}