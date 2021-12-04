
package correccionexamen;

import java.util.Scanner;


public class CorreccionExamen {

    public static void main(String[] args) {
        // TODO code application logic here
        Autor[] autores = new Autor[3];
        Scanner entrada = new Scanner(System.in);
        
        autores[0] = new Autor("A1", "P1");
        autores[1] = new Autor("A2", "P2");
        autores[2] = new Autor("A3", "P3");
        
        Libro[] libros = new Libro[10];
        int contadorLibros = 0;
        
        int opcion;
        int contador = 0;
        do{
        
        System.out.println("Menu de opciones");
        System.out.println("1) Ingresar un nuevo libro");
        System.out.println("2) Ver lista de favoritos");
        System.out.println("3) Contar libros del autor");
        System.out.println("Ingrese la opcion que desea ");
        opcion = entrada.nextInt();
        entrada.nextLine();
        
       
        switch(opcion){
            case 1:
               
              
                System.out.print("Ingrese el titulo del libro: ");
                String titulo = entrada.nextLine();
                
                System.out.print("Ingrese el año del libro: ");
                int anio = entrada.nextInt();
                entrada.nextLine();
                
                System.out.print("¿Es favorito?: (Si o No)");
                String favoritoString = entrada.nextLine();
                boolean favorito;
                favorito = (favoritoString.equals("Si") ? true: false); //Cualquir cosa que devuelva un boolean puede reemplazarse ´pr el ?
                
                
                System.out.println("Seleccionar el autor");
                System.out.println("1) "+autores[0].getNombre());
                System.out.println("2) "+autores[1].getNombre());
                System.out.println("3) "+autores[2].getNombre());
                
                
                
                int opcionAutor = entrada.nextInt();
                entrada.nextLine();
                
                Autor autorLibro = autores [(opcionAutor-1)];
                
                Libro nuevoLibro = new Libro(titulo, anio, favorito, autorLibro);
                libros [contadorLibros] = nuevoLibro;
                contadorLibros++;
                
                break;
            case 2:
                /*
                for(int i=0; i<libros.length; i++){ //Para cada libro dentro del arreglo de libros
                    if(libros[i] != null && libros[i].isFavorito()){
                        System.out.println(libros[i].getTitulo()); 
                    }
                }*/
                
                for(Libro libro : libros){ //Para cada libro dentro del arreglo de libros
                    if(libro != null && libro.isFavorito()){
                        System.out.println(libro.getTitulo()); 
                    }
                }
                break;
            case 3:
                
                
                System.out.println("Seleccionar el autor");
                System.out.println("1) "+autores[0].getNombre());
                System.out.println("2) "+autores[1].getNombre());
                System.out.println("3) "+autores[2].getNombre());
                
                int opcionAutor1 = entrada.nextInt();
                entrada.nextLine();
                
                Autor autorSeleccionado = autores[opcionAutor1 -1];
                int contadorLibrosAutor = 0;
                
                for(Libro libro: libros){
                 if(libro != null && libro.getAutor().equals(autorSeleccionado)){
                     contadorLibrosAutor++;
                 }
                    
                }
                System.out.println("Este autor tiene "+contadorLibrosAutor+" Libros.");
                
                
                
                break;
            case 4:
                break;
            default:
                break;
            
            
            
        }
        
        }while(opcion !=4);
        
    
    
}
    
}
