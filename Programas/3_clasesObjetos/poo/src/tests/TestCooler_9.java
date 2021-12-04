/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author hp
 */
public class TestCooler_9 {
    //Métod estáticos, funcionan igual como con las variables. (Ver TestCounter)
    public static void main(String[ ] args) { //Also, the main method must always be static. Becouse pertenece a esta clase
        Cooler.horn();
    }
}

//Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.