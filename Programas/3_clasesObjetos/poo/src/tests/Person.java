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
public class Person {
    
  //Modificadores de acceso
  private int age;
  private String name;
  private double weight; //It's a best practice to keep the variables within a class private. 
  //The variables are accessible and modified using Getters and Setters.

  public void sayHi() {
    System.out.println("Hello!");
  }
}
