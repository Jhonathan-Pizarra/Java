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
public class TestVehicle_2 {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle(); //Creo el objeto v1 de tipo vehículo
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();
        
        System.out.println("Color: "+ v1.color);
        System.out.println("capacidad tanque: "+ v1.fuelCapacity);
        System.out.println("velocidad máxima: "+ v1.maxSpeed);
    }
}
