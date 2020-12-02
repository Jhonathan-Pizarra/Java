
package test10;

import java.util.Scanner;

public class Test10_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Datos[] estudiante = new Datos[1];
        
        //Atributos
        int [] numeroSalon = new int[2];
        String [] nombreSalon = new String[2];
        //....
        Materias [] materias = new Materias[2]; //Y se la trata igual que con otros tipos de datos String, int, con una sola difetrencia..
        
        //Informacion
        for(int i=0; i<estudiante.length; i++){
        
            estudiante[i] = new Datos(); //Estudiantes es un objeto, debo, un arreglo de objeto, a cada uno debo instancirlo...
            
            System.out.print("¿Cómo se llama?: ");
            String nombreEstudiante = entrada.next();
            estudiante[i].setNombre(nombreEstudiante);
            
            System.out.print("¿Cuál es su edad?: ");
            byte edadEstudiante = entrada.nextByte();
            estudiante[i].setEdad(edadEstudiante);
            
            System.out.println("##MATERIAS##");
            for(int j=0; j<materias.length; j++){
                 materias[j] = new Materias(); //Este si debe ir dentro del bucle, es un objeto poruqe tiene sus propios atributos,
                                                //Por tanto debe ser instanciado. 
            
                System.out.println("    Materia ["+(j+1)+"]");
                System.out.print("Nombre-Materia: ");
                String nombreMateria = entrada.next();
                materias[j].setNombre(nombreMateria);
                
                System.out.print("Nivel-Materia: ");
                int nivelMateria = entrada.nextInt();
                materias[j].setNivel(nivelMateria);
              
                
            }
            estudiante[i].setMaterias(materias);
            
            //.... Sigue pidiendo datos...
            //Usar una variable "creada" por nosotros
            System.out.println("¿Cuál es la dirección?");
            System.out.print("Nombre: ");
            String direccionDomicilio = entrada.next();
            
            Direccion domicilio = new Direccion(); // (1) -> Este ya estaba instanciado aqui
            domicilio.setNombre(direccionDomicilio);
            estudiante[i].setDireccion(domicilio);
            
            //Usar una variable "creada por nosotros" que "existe en otra variable"
            //Fechas existe en direccion, y direccion a su vez existe en datos ^^
            System.out.println("Fecha de Matriculacion");
            System.out.print("Año de Matricula: ");
            int añoMatricula = entrada.nextInt();
           
            Fechas fecha = new Fechas();
            fecha.setAñoMatriculacion(añoMatricula); //A la fecha colocale un año: Esta clase Fecha tiene sus propios atributos
            domicilio.setFecha(fecha);              //Al domicilio colocale una fecha : Fecha existe en la clase Direccion como un atributo
            estudiante[i].setDireccion(domicilio);  //Al estudiante colocale un dolicilio --> (1): Dirrecion existe en la clase Datos como atributo
            
            
 
        }
        
        //Iteracion para imprimir
        for(int i=0; i<estudiante.length; i++){
            System.out.println("Nombre: "+estudiante[i].getNombre());
            System.out.println("Edad: "+estudiante[i].getEdad());
            //Materias
            for(int j=0; j<materias.length; j++){
                System.out.println("    Materia ["+(j+1)+"]");
                System.out.println("Nombre_Materia: "+materias[j].getNombre());
                System.out.println("Nivel: "+materias[j].getNivel());
          
            }
            System.out.println("Direccion: "+estudiante[i].getDireccion().getNombre());
            System.out.println("Fecha_Matricula: "+estudiante[i].getDireccion().getFecha().getAñoMatriculacion());
 
            
            
            System.out.println("Seguir poniendo atribtos...");
          
            
        }
        
        
        
    }
    
}
