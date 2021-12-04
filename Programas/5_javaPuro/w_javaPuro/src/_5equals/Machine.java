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
public class Machine {
    String name;
    Machine(String n) {
        name = n;
    }

    //Este código es reutilizable y autogenerado
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Machine other = (Machine) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
  
  //hashCode() method is used to determine where to store the object internally. Whenever you implement equals, you MUST also implement hashCode.
}

//You can use the same menu to generate other useful methods, such as getters and setters for your class attributes.