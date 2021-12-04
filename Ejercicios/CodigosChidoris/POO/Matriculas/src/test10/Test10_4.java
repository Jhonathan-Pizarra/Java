package test10;

import java.util.Scanner;

public class Test10_4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Objeto
        Datos[] esttudiante = new Datos[2]; //Un arreglo de 2 objetos
        
        //Atributos
        
        String [] nombreSalones = new String[2];  
        int [] numeroSalones = new int[2]; //Numeracion de salon: Tec-114... Pero este no se puede instanciar como String
        //"String es realmente un objeto", e int, ese si es un tipo de dato... por eso, lo que hacemos es: ah, y bueno,
        //en sentido del programa, lo lógico es que el numero de Numeración de salones sea igual al d elos nombres... para cada salon una numeración
        
        
        //Deben ser declarados fuera del bucle los arreglos de atributos

        
        //Si queremso ingresar datos de un arreglo de objetos, de ley. bucles
        System.out.println("INFORMACIÓN PRIMARIA");
        for(int i=0; i<esttudiante.length; i++){
            esttudiante[i] = new Datos();
           //Informacion...
            System.out.print("¿Cómo se llama?: ");
            String nombreEstudiante = entrada.next();
            esttudiante[i].setNombre(nombreEstudiante);
          //Etc... atributos ¿Pero y atributos con arrelgos?
            //Así:
            System.out.println("##Nombre de salones##");
            nombreSalones = new String[2]; //PARA CADA ITERACIÓN DE I, creame un arreglo de nombresdeSalones, eso estoy haciendo

            for(int j=0; j<nombreSalones.length; j++){
                System.out.print("Salon ["+(j+1)+"]: ");
            
                nombreSalones[j] = entrada.next();
             
  //              esttudiante[j].setNombreroSalon(nombreSalones); //Estoy me da error, ya que todavía no he instanciado un objeto en la posicion 1 (cuando j itere por 2da vez) "EL OBJETO NO EXISTE TODAVIA"
  //              esttudiante[i].setNombreroSalon(nombreSalones); //Esto estoy diciendo que el estudiante [i] le corresponde el salon 0, luego el salon 1.. y así..irán sobreescribiendo
            }
            esttudiante[i].setNombreroSalon(nombreSalones); //Esto estoy diciendo que el estudiante [i[ tendrá un total de 3 salones
            
            System.out.print("¿Cuál es la edad?: ");
            byte edad = entrada.nextByte();
            esttudiante[i].setEdad(edad);
            
            System.out.print("¿Cuánto es su peso?: ");
            double peso = entrada.nextDouble();
            esttudiante[i].setPeso(peso);
            
            System.out.println("##Numeros de Salones##");
            numeroSalones = new int[2]; //ESTO es igual xD
            for(int k=0; k<numeroSalones.length; k++){
                  System.out.print("Ingrese el numero del salón ["+(i+1)+"]: ");
                  numeroSalones[k] = entrada.nextInt(); //Numeración de salones Tec- "114",
            
            }
            esttudiante[i].setNumeroSalon(numeroSalones);
            //etc.......
            
            System.out.println("");
            
        }
        
        System.out.println("INFORMACIÓN...");
        for(int i=0; i<esttudiante.length; i++){
            System.out.println("Nombre: "+esttudiante[i].getNombre()); //Este solo fue un atributo
            
            for(int t=0; t<nombreSalones.length; t++){
                System.out.println("Salon(es): "+esttudiante[i].getNombreroSalon()[t]); //Este fue un arreglo de Strings 
           
            }
            
             for(int t=0; t<numeroSalones.length; t++){
                System.out.println("Salon(es): "+esttudiante[i].getNumeroSalon()[t]); //Este fue un arreglo de Strings 
           
            }
            
            System.out.println("Edad: "+esttudiante[i].getEdad());
           
        }
        
        //Un objeto puede tener varios atributos
        //Varios objetos, pueden tener varios atributos 
        //En este caso, hemos ya usado arreglo de objetos y de atributos para cada objeto, pero ¿Y si quisiera usar los mios propios?
        //VER EL sigueinte Test xD
        
    }
    
}
