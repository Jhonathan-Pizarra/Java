//Repaso de coceptos
package test10;

import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        //Datos del estudiante
        Datos[] estudiante = new Datos[4];
        
        estudiante[0] = new Datos("Jhonathan",(byte)19,51.4,1996,11,19,'M');
        estudiante[1] = new Datos(); 
        //Datos para el estudiante [1]
        String nombre = entrada.nextLine();
        byte edad = entrada.nextByte();
        double peso = entrada.nextDouble();
        int anioNacimiento = entrada.nextInt();
        int mesNacimiento  = entrada.nextInt();
        int diaNacimiento  = entrada.nextInt();
        // char sexo = entrada.next(); //Aqui sale error, char no puede ser convertido a String
        char sexo = entrada.next().charAt(0); //Recibe el primer caracter que ingrese por teclado
        //FALTARIAN LOS Setter y gettter para dales valores...
        //O podriamos definir desde aqui
        estudiante[2] = new Datos(nombre, edad, peso, anioNacimiento,mesNacimiento,diaNacimiento,sexo);
        
        
        //Datos para el estudiante [3]
        String nombre2 = "Jhonathan";
        byte edad2 = 19;
        double peso2 = 51.2;
        int anioNacimiento2 = 1996;
        int mesNacimiento2 = 11;
        int diaNacimiento2 = 19;
        char sexo2 = 'M';
        estudiante[3] = new Datos(nombre2, edad2, peso2, anioNacimiento2,mesNacimiento2,diaNacimiento2,sexo2);
        
    
        //Hasta aqui solo hemos hecho de almacenar información, el amarillo dice que todavía no hemos usado a nuestro objeto
        //Sin embargo ya lo hemos inicializado... De 3 posibles y distintas maneras:
        //Pasarle todo definido desde el constructor
        //Pasar por teclado al constructor
        //Pasar cada atributo definido, y luego pasarlo al contructor 
        
        //Sin embargo, vemos que el estudiante se pone amarillo, eso es porque todavía no hemos usado ese objeto, no le hemos puesto un valor
        //Ver el siguiente Test:10_2
        
        
     
        
    }
    
}


