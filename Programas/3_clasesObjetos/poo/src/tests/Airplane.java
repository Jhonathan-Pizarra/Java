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
public class Airplane {
  private String color;

  //Método contructor
  Airplane() {
    this.setColor("Red");
  }
  
  //Una clase puede tener 1 o más contructores, pero siempre deben diferenciar en el numeor de parámetros que reciban
  Airplane(String c) {
    this.setColor(c);
  }

  //Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.
  
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    
    // Getter
    public String getColor() {
        return color;
    }
}
