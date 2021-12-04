/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4array_list;
import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class ArrayDinamico {
    public static void main(String[ ] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        
        System.out.println(colors);
    }
}