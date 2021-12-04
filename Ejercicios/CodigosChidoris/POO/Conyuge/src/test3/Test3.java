/*
Hacwer un porgrama simple, usando el toString
Un proggrama que me reciba varios saludos
Para cada uno:
tengan cada uno un nombre
una edad
un id
y me imprima con el toString

Hacer otro, unos más simple, que me reciba en el constructros el nombre y me salude...

Y hacer otro, en otra clase 

*/
package test3;

import java.util.Scanner;


public class Test3 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Información saludo = new Información();
        /*
        Este es el mas simple xd
        int year = 2002; int month=11; int day=10;
        saludo.setNombre("Jhonathan"); //Me va a convertir este metodo a un String 
        saludo.setFechaNacimiento(year, month, day);
        saludo.setEstadoCivil("Soltero");
        saludo.setEdad(19);
 
        System.out.println("Hola "+"\n"+saludo);*/
        
        Información[] saludo2 = new Información[2]; //Este es otro objeto con nombre saludo 2 we
        Scanner entrada = new Scanner (System.in);
        
        for(int i= 0; i<saludo2.length; i++){
            
            saludo2[i] = new Información();
            
            System.out.print("Ingrese un nombre para ["+(i+1)+"]: ");
            String nombreArtista = entrada.next();
            saludo2[i].setNombre(nombreArtista);
            
            System.out.print("Ingrese el estado civil para["+(i+1)+"]: ");
            String estadoArtista = entrada.next();
            saludo2[i].setEstadoCivil(estadoArtista);
            
            System.out.println("Ingrese fecha de nacimiento para ["+(i+1)+"]: ");
            int year; int month; int day; 
            System.out.print("Año: "); year  = entrada.nextInt();
            System.out.print("Mes: "); month = entrada.nextInt();
            System.out.print("Dia: "); day   = entrada.nextInt();
            saludo2[i].setFechaNacimiento(year, month, day);
            
            System.out.println("");
    
        }
        
        for(int i=0; i<saludo2.length; i++){
        
            System.out.println("Hola"+"\n"+saludo2[i]);
            System.out.println("");
        }
       
    }
    
}
