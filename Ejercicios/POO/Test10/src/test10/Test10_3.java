package test10;

import java.util.Scanner;


public class Test10_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        /*1)*/ 
        Datos estudiante = new Datos();
        
        /*2)*/
        //estudiante.setNombreroSalon("Tec-34", "Marcelo Davila");
        String [] nombreSalon = new String[3]; //O 3 salones
        int [] numeroSalon = new int[3]; //Por ejemplo 122 o 444 Salón 122 
        
        //FOR PARA SETTERS
        for(int i=0; i<nombreSalon.length; i++){
            //OJO MUY IMPORTANTE /*3*/
            System.out.print("Ingrese el nombre del salónn ["+(i+1)+"]:"); 
            nombreSalon[i]= entrada.nextLine();
            //Podemos ir colocando el valor que vayamos obteneindo..
            estudiante.setNombreroSalon(nombreSalon);
       
        }
        System.out.println("");
        
        for(int i=0; i<numeroSalon.length; i++){
            //OJO MUY IMPORTANTE /*3*/
            System.out.print("Ingrese el numero del salónn ["+(i+1)+"]:"); 
            numeroSalon[i]= entrada.nextInt();
            //Podemos ir colocando el valor que vayamos obteneindo..
            estudiante.setNumeroSalon(numeroSalon);
            
        }
        System.out.println("");
        
        //FOR PARA GETTERS
        //Un for para geeter  /*4*/
         System.out.println("Salones de clase: ");
           for(int i=0; i<nombreSalon.length; i++){
               
               System.out.println("Salón ["+(i+1)+"]: "+estudiante.getNombreroSalon()[i]);
      
        }
           
          System.out.println("Numero...Salones de clase: ");
           for(int i=0; i<numeroSalon.length; i++){
               System.out.println("Numero-Salón["+(i+1)+"]: "+estudiante.getNumeroSalon()[i]);
     
        }
        
       
        
        //1) Ten en cuenta que, no necesito hacer un arreglo de objetos "estudiante" para usar un arreglo de uno de sus atributos "nombreSalón" por ejemplo, 
        //Porque un estudiante puede tener varios salones, así en numeroMaterias para saber si el estudiante cursa 1 o más materias,e s porpio del estudiante.

        //2) En este caso lo que hacemos es intentar setear un arreglo de strings, pero no es posible, a menos que almacenee todos esos Strings en un arrglo de materias!
        //Si hablamos de arreglos... ambién hablamos de... bucles !
        
        //3) ES MUY IMPORTATE, al trabajar con arreglos, y bucles, darle un estado inicial al objeto en cada posicion...
        //En este caso, no es necesario darle estado inicial a String[] nombreMaterias, porque Sring es considerado un tipo de dato no primitivo
        //Pero ya verémos en casos siguientes que si tenemos un arreglo de objetos, es necesario darles estado incial a cada uno en la posicion en que esten
        //Esta es la diferencia, a veces hacemos arreglos de objetos: estudiante[0] = new Estudiante
        //.......Y a veces, hacemos arreglo de atribtos nombreMateria[2] = "Fisica"   //El nombre de la materia en la posicion 2 es fisica (Y esta a su vez es un atributo de estudiantes)     
   
        //4) Es de importancia el que si lo meto en un solo bucle para todos los getter, ver que el tamaño de los dos arreglos no dañe la iteracion del bucle
           
    
           //En este caso, hemos hecho es dar valores a los atributos a manera de arreglos de un objeto
           //En el prócimo veremos arreglos de objetos
    
    
    }
    
}
