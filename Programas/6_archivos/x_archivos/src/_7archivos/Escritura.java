/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7archivos;
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class Escritura {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("test.txt");
            f.format("%s %s %s", "1","Johnathan", "Pizarra \r\n");
            f.format("%s %s %s", "2","Dayanna", "Chase");
            f.close();

            File x = new File("test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close(); //Don't forget to close the file once you're finished writing to it!
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
}