/*
En esta ocacion examinaremos la herencia de los contrucores, recomiendo ver primero la herencia de Animal antes de ver este
 */
package _2herencia;

/**
 *
 * @author hp
 */
public class TestB {

  
    public static void main(String[] args) {
        B obj = new B(); //However, the constructor of the superclass is called when the subclass is instantiated.
    }
    
}

//You can access the superclass from the subclass using the super keyword.
//For example, super.var accesses the var member of the superclass