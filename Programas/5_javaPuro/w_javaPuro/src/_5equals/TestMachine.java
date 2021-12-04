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
public class TestMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine a1 = new Machine("Robby");
        Machine a2 = new Machine("Robby");
        System.out.println(a1.equals(a2));
    }
    
}
