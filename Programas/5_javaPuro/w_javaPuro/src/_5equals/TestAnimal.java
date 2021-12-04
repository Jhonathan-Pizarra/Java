/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5equals;

/**
 *
 * @author hp
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        //When you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
        System.out.println(a1 == a2); // having two objects with the same name, the equality testing returns false, because we have two different objects (two different references or memory locations).
    
    }
    
}
