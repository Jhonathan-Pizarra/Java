/*
Hacer u nprograma que me registre 3 estudiantes. (Nombre, edad, Pais, fecha de nacimiento, materias)
Cada estudiante deberea ser matriculado en la menos una materia (máximo 3) 
Hacer un menu, que me indique ingresar un estudiante... 2) Ver informacion, 3) salir
Comparar estudiantes, si son iguales en nombre edad, pais, fecha de nacimiento y materias, decir este se repite con este otro
Y me pida nuevamente los datos para poder avanzar... Listo ! 
Imrpimir todo con el metodo ToString
 */
package testlast;
import java.util.Scanner;

public class TestLast {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        Estudiantes [] alumnos = new Estudiantes[2];
        Materias[] materias    = new Materias [2]; 
        String [] cursos       = new String[1];
        
        System.out.println("###INFORMACION ESTUDIANTES###");
        for(int i=0; i<alumnos.length; i++){
            boolean validacion =false; 
            do{
            alumnos[i] = new Estudiantes(); // Innstanciar el objeto
            System.out.println("Estudiante ["+(i+1)+"]");
            System.out.print("Ingrese nombre: "); 
            String nombreEstudiante = entrada.next();
            alumnos[i].setNombre(nombreEstudiante);
            
            System.out.print("Ingrese la edad: "); 
            int edadEstudiante = entrada.nextInt();
            alumnos[i].setEdad(edadEstudiante);
        
            System.out.print("Pais de Origen: "); 
            String paisEstudiante = entrada.next();
            alumnos[i].setPais(paisEstudiante);
            
            System.out.println("¿Fecha de nacimiento?");
            System.out.print("Año: "); int anioNacimiento = entrada.nextInt();
            System.out.print("Mes: "); int mesNacimiento  = entrada.nextInt();
            System.out.print("Dia: "); int diaNacimiento  = entrada.nextInt();
            alumnos[i].setFechNacimiento(anioNacimiento, mesNacimiento, diaNacimiento);
            
            //Materias ...
            System.out.println("###MATERIAS ESTUDIANTE###");
            for(int j=0; j<materias.length; j++){
                materias[j] = new Materias();
                
                System.out.println("    Materia ["+(j+1)+"]");
                System.out.print("Nombre de materia ["+(j+1)+"]: ");
                String nombreMateria = entrada.next();
                materias[j].setNombre(nombreMateria);
                
                System.out.print("Nivel de materia  ["+(j+1)+"]: ");
                int nivelMateria = entrada.nextInt();
                materias[j].setNivel(nivelMateria);
                
                
            }
            
            alumnos[i].setMaterias(materias);
            //Cursos...
             System.out.println("###CURSOS ESTUDIANTE###");
             //¿Cuantos cursos? le podría peguntar
             //cursos = new String[n];
            for(int k=0; k<cursos.length; k++){
                System.out.println("    Curso ["+(k+1)+"]");
                System.out.print("Ingrese el Curso ["+(k+1)+"]: ");
                cursos[k] = entrada.next();
            }
             alumnos[i].setCursos(cursos);
            
    
             //Comparación
             for(int c=0; c<alumnos.length; c++){
                 
                     if(alumnos[c]!= null){
                         if(i == c){
                            validacion=true;
                            break;
                            
                         }else if(alumnos[i].equals(alumnos[c])){
                            System.out.println("["+(c+1)+" y "+(i+1)+"], son iguales");
                            break;
                         }else{
                             validacion=true;
                         }
                     } 
             
             }
             
        }while(validacion != true);
        
        
        
        
            System.out.println("");
        }
        System.out.println("");
        
        for(int f=0; f<alumnos.length; f++){
            System.out.println(alumnos[f]);
            System.out.println(". ____________________ .");
        }
        /*
        for(int i=0; i<alumnos.length; i++){
            System.out.println("INFORMACION ALUMNO...");
            System.out.println("Nombre: "+alumnos[i].getNombre());
            System.out.println("Edad: "+alumnos[i].getEdad());
            System.out.println("Pais: "+alumnos[i].getPais());
            System.out.println("Fecha_Nacimiento: "+alumnos[i].getFechNacimiento());
            
            System.out.println("INFORMACION MATERIAS...");
            for(int j=0; j<materias.length; j++){
                System.out.println("Materias: "+materias[j].getNombre());
                System.out.println("Materias: "+materias[j].getNivel());
            }
            
            System.out.println("INFORMACION CURSOS...");
            for(int k=0; k<cursos.length; k++){
            System.out.println("Salón: "+alumnos[i].getCursos()[k]); //El curso en la poscicion [i] itera sobre todos los cursos
            
            }
                   
        
        } */
        
        
    }
    
}
