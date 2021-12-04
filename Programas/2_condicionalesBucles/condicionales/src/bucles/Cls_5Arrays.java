/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author hp
 */
public class Cls_5Arrays {
     public static void main(String[] args) {
        //Inicializar el array
         String[ ] myNames = { "A", "B", "C", "D"};
        System.out.println(myNames[2]);
        
        //Lenght
        int[ ] intArr = new int[5];
        System.out.println(intArr.length);
        
        //Recorrer un array, con bucles
        int [ ] myArr = {6, 42, 3, 7};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}
    
