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
public class Car extends Vehicle{
    //Recierda que para sobreescribir, el método hijo debe tener
    //-mismo tipo de retorno
    //-misma cantidad y tipos de argumentos
    @Override
    public void makeSound() {
        System.out.println("Clack!");
    }
}
