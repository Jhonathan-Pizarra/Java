/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2herencia;

/**
 *
 * @author hp
 */
class Animal {  //no le pongo modificador de acceso debido a que están en el mismo paquete, y son accesibles..
    //Recall the protected access modifier, which makes the members visible only to the subclasses.
    protected int legs;
    public void eat() {
        System.out.println("Animal eats");
    }
}
