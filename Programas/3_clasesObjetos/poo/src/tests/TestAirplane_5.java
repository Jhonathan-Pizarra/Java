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
public class TestAirplane_5 {
    public static void main(String[] args) {        
        //color will be "Red"
        Airplane a1 = new Airplane();
        
        //color will be "Green"
        Airplane a2 = new Airplane("Green"); 
        
        System.out.println(a2.getColor());
    }
}
