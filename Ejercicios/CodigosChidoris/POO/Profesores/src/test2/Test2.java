/*
Crear un programa simple, comparar 3 objetos usando el equals
si son el mismo nombre, 
mismas fecha de nacimiento,
mismo pais

*/
package test2;

import java.util.Scanner;


public class Test2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor[] profesores = new Profesor[3];
        Scanner entrada = new Scanner(System.in);
    
        
        for(int i=0; i<profesores.length; i++){
            profesores[i] = new Profesor();
            
            System.out.print("Nombre del profesor: ");
            String nombreProfesor = entrada.next();
            profesores[i].setNombre(nombreProfesor);
            
            /*
            System.out.println("Fecha de naciemiento");
            int year; int month; int day;                       //FPor ejemplo:
            System.out.print("Año: "); year  = entrada.nextInt(); //Año 1997
            System.out.print("Mes: "); month = entrada.nextInt(); // Mes 12
            System.out.print("Dia: "); day   = entrada.nextInt(); // Dia 13
            profesores[i].setFechaNacimiento(year, month, day);
            
            
            System.out.print("Pais de Nacimiento: ");
            String paisNacimiento = entrada.next();
            profesores[i].setPais(paisNacimiento);
            */
            
            System.out.println("");
            
        }

        
            for(int i=0; i<profesores.length; i++){
                for(int j=0; j<profesores.length; j++){
                    if(i == j){
                        System.out.println("De ley, son el mismo ["+(i+1)+"] "+" y "+"["+(j+1)+"]");
                        
                    }else if(profesores[i].equals(profesores[j])){
                    System.out.println("Profesor ["+(i+1)+"] "+" y "+"["+(j+1)+"], son el mismo");
                    

                    }else{
                        //System.out.println("Son diferentes");
                    
                    }
                    
                    }
                }
                
                
            }
    }
    

