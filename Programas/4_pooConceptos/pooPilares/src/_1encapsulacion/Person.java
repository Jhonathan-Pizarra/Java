/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1encapsulacion;

/**
 *
 * @author hp
 */
public class Person {
    private int age;
    //The idea behind encapsulation is to ensure that implementation details are not visible to users. 
    //The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. 
    
    
    //To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.
    public void setAge(int a){
        if(a > 0){
            this.age = a;
        }
    }
    
}
