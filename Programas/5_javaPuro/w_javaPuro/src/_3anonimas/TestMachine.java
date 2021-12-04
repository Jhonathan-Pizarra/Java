/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3anonimas;

/**
 *
 * @author hp
 */
public class TestMachine {
    public static void main(String[ ] args) {
        Machine m = new Machine() { //After the constructor call, we have opened the curly braces and have overridden the start method's implementation on the fly(en caliente).
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start();
    }
}

/*
The @Override annotation is used to make your code easier to understand, because it makes it more obvious when methods are overridden.
*/