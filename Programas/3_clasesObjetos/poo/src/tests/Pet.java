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
public class Pet {
    private String name;
    private int age;
    
    Pet (String n) {
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int p) { 
        this.age = p;
    }
}
