/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages.samples;

/**
 *
 * @author hp
 */
public class Vehicle {
    //Now we are goign to organize our classes, and we do it with packages, normal we will have 2 packaes, 1 for clases, ( atrbiutes, methods) and other for tests (main class)
    //Atributos o características
    private int year;
    private String name; //It's a best practice to keep the variables within a class private.   
    //The variables are accessible and modified using Getters and Setters.

   // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String n) {
        this.name = n;
    }

}