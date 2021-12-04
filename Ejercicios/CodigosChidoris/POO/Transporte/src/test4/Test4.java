/*
    Hacer un programa en el que tenga que usar variables creadas en otras clases
    Hacer un arreglo de un atributo (Tipo de producto) de un objeto Prodcutos
    
*/

package test4;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Autobus bus = new Autobus();
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese Marca: ");
        String marcaAutobus = entrada.next();
        bus.setMarca(marcaAutobus);
        
        System.out.print("Ingrese Numero de ruedas: ");
        int ruedasAutobus = entrada.nextInt();
        bus.setRuedas(ruedasAutobus);
        
        System.out.print("Ingrese Peso: ");
        double pesoAutobus = entrada.nextDouble();
        bus.setPeso(pesoAutobus);
        
        System.out.println("Ingrese Pasajeros: ");
        System.out.print("Nombre: ");
        String nombrePasajeros = entrada.next();
        //¿Cómo usar la variable Pasajeros del Autobus?
        //ASI:
        Pasajeros pasajero = new Pasajeros();
        pasajero.setNombre(nombrePasajeros);
        pasajero.setEdad(12);
        
        bus.setPasajeros(pasajero);
        
        Sexo genero = new Sexo();
        genero.setGenero("Masculino"); //Al sexo colocale un genero 
        pasajero.setSexo(genero); // Al pasajero un sexo
       
        bus.setPasajeros(pasajero); // Al bus un pasajero
        
        
        System.out.println("Informacion "+"\n"+bus);
        
        
        
      
        
       
     
  
        
        
        
    }
    
}
