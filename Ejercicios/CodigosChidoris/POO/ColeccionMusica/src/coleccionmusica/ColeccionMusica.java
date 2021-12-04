
package coleccionmusica;

import java.util.Scanner; //Importa para que te deja usar el Scanner


public class ColeccionMusica {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); //Puse primero para poder ingresar valores desde donde queria
        System.out.println("Bienvenido! "); //Mensaje para el usuario
        System.out.print("¿Cuántos artistas vas a ingresar?: "); //Le pregunto cuantos artistas va a ingresar para poder comenzar el programa
        int numeroArtistas = entrada.nextInt(); //Declaro un entero que alojará el numero que ingrese el usuario
        Artista[] artista = new Artista[numeroArtistas] ; //Ese numero lo mando a un arreglo de tamaño n ingresado por el usuario
        
        boolean terminar = false; //Esto declaro para iterar dobre el do-while, que si terminar se hacer verdadero se termina el bucle
        
      
        do{ //Comienza el bucle
            System.out.println("1) Ingrese un Artista "); //Opcion 1
            System.out.println("2) Ver información ");//Opcion 2
            System.out.println("3) Salir "); //Opcion 3 , si el usuario ingresa 3 el boolean se hace true, y se termina el do-while
            System.out.print("Escoge una opcion: "); //Pregunta 4
            int opcion = entrada.nextInt(); //Declaro un entero que alojará la opcion que ingrese el usuario
            
            switch(opcion){ //Comienzo mandando la opcion
            
                case 1: //Si la opcion ingresada es la 1
                    //Ingresamos el artista, ya le habiamos dicho que tenia un tamaño n dado por el usuario
                    System.out.println("### Datos del Artista ###"); //Mensaje para el usuario
                    for(int i=0; i<artista.length; i++){ //declaro un iterador en 0 menor al tamaño del arreglo de artista, que irá sumando 1 
                         artista[i] = new Artista(); //Inicializo el objeto artista en la posicion [i]
                        
                         System.out.print("Nombre de ["+(i+1)+"]: "); //Mensaje para el usuario
                         String nombreArtista = entrada.next(); //Declaro un tipo de dato String que me alojará el nombre que ingrese el usuario
                         artista[i].setNombre(nombreArtista); //AL artista de la posicion[i] colocale ese nombre que ingrese en la linea anterior
                         
                         System.out.print("Fecha de nacimeinto de ["+(i+1)+"]: ");//Mensaje para el usuario
                         int year; int month; int day; //Declaro estas variables que pasaré como argumento (MIRA EL SETTER de fecha de nacimiento antes de seguir leyendo...)
                         System.out.print("Año: "); year  = entrada.nextInt(); //Año: 1998
                         System.out.print("Mes: "); month = entrada.nextInt(); // Mes: 12
                         System.out.print("Dia: "); day   = entrada.nextInt(); // Dia: 3
                         artista[i].setFechaNacimiento(year, month, day); //Al artista en la posicon [i] colocale el año, el me, y dia en que nacio
                         
                        System.out.print("País de ["+(i+1)+"]: "); //Lo mismo que hicimos en nombre  para pais
                        String paisArtista = entrada.next();
                        artista[i].setPais(paisArtista);
                        
                        //Hasta ahi voy a comprar
                        //REVISA EL METODO EQUALS CUANDO LLEGUES AQUI, el metodo equals esta en mi clase artista, porque yo voy a comparar
                        //entre artistas...
                    
                    }
                    
                    for(int i=0; i<artista.length; i++){ //Este bucle, dice que itera sobre el tamaño de artistas (Que definimos al comienzo)
                        for(int j=0; j<artista.length; j++){ //Este otro bucle itera tambien sobre el tamaño de artistas
                            if(i == j){ //Si el artistas en la posicon [i] es igual al de [j] son el mismo, "El artista en la poscion 0 es igual al artista en la posicon 0" eso es redundar
                            //System.out.println("Iguales ["+(i+1)+"] y ["+(j+1)+"]"); 
                                 System.out.println("¿Cuantos albums?: "); //Le pregunto
                                    int numeroAlbums = entrada.nextInt(); //Le digo que me diga el tamaño del arreglo de albums que va a ingresar
                                    Album[] albums = new Album[numeroAlbums]; // Le doy ese tamaño ingresado
                                    
                                    for(int k=0; k<albums.length; k++){ //Este for lo hago para: itera sobre el tamaño del album BOY a ingresar informacion del album
                                    
                                        albums[k]= new Album(); //Album de la posicion [k] lo inicializo, no te olvides, siempre al inicio del bucle hay que inicialiar el objeto
                                        System.out.print("Nombre del Album: ");
                                        String nombreAlbum = entrada.next(); //Pido nombre
                                        albums[k].setNombre(nombreAlbum); //coloco nombre "Del Album" en el objeto "Album" no en el objeto artista
                                 
                                        System.out.print("NAño de lancamiento: ");
                                        int añoLanzamiento = entrada.nextInt(); //Pido año de lanzamietno
                                        albums[k].setAnioLanzamiento(añoLanzamiento); //coloco año de lanzamiento
                                        
                                        
                                        artista[i].setAlbums(albums); //Al artista en la posicion [i] recuerda que este bucle de j y k están en dentro del bucle de i
                                        //Al artista i colocale esos albums !!
                                    }
                           
                            }else if(artista[i].equals(artista[j])) { //Ademas, si no esta redundando, es decir, si te dice artista [1] es igual al artista [2], entocnes:
                                System.out.println("Son iguales ["+(i+1)+"] y ["+(j+1)+"]"); //Imprime esto
                                System.out.print("¿Desea sobreescribir el album este artista?: S1 = 1  y No = 0");//Preugnta
                                
                                int respuesta = entrada.nextInt(); //Rsponde
                                
                                if(respuesta == 1){ //Si le repsonde que si...    ella es la indicada papuh :'v jaja
                                    System.out.println("¿Cuantos albums?: "); //Vas a sobreescribir los albums y se repite la explicacion que te di sobre los albums...
                                    int numeroAlbums = entrada.nextInt();
                                    Album[] albums = new Album[numeroAlbums];
                                    
                                    for(int k=0; k<albums.length; k++){
                                    
                                        albums[k]= new Album();
                                        System.out.print("Nombre del Album: ");
                                        String nombreAlbum = entrada.next();
                                        albums[k].setNombre(nombreAlbum);
                                 
                                        System.out.print("NAño de lancamiento: ");
                                        int añoLanzamiento = entrada.nextInt();
                                        albums[k].setAnioLanzamiento(añoLanzamiento);
                                        
                                        
                                        artista[i].setAlbums(albums);
                                        
                                        
                                        
                                        
                                    }
                                }else{ //caso contrario si dice que no queire sobreescribirn nada, le dices
                                    System.out.println("Ok");
                                }
                            
                            }else{ //En caso que no redudee [1] es igual a[1] ni tampoco que haya dos iguales (o mas) [1 es igual al 2do], no hagas nada entonces bucle
                                 //System.out.println("¿Desea ingresar un algum nuevo para este artista?: ");
                            }
                        }
                        
                    }
          
               
                    break;
                case 2: //Listo, vamos a imprimri
                    System.out.println("Información Artista"); //Mensaje
                    for(int i=0; i<artista.length; i++){ //Bucle que itera sobre el tamaño del artista, es de el de quien presentamos la inforamcion
                    System.out.println(artista[i]); //Cda artista en cada posicion guardó un nombre, una fecha, y un album Y EL ALBUM (O albums) a su vez guardo su propio nombre , numero de canciones, jeugos de azar y ,mujerzuelas :v
                    }
                   /* for(int i=0; i<artista.length; i++){
                    System.out.println(albums);
                    } */
                    
                    
                    break;
                case 3: //Lo demas,,,se cuenta solo
                    terminar = true;
                    break;
                default:
                    break;
            
            }
            
            
        
        }while(terminar != true);
    }
    
}
