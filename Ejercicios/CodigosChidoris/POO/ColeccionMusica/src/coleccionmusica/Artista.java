/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica;

import java.util.Date;
import java.util.GregorianCalendar;

public class Artista {
    
    private String nombre;
    private Date fechaNacimiento;
    private String pais;
    private int [] discos;
    private String [] conicertos; //Liverpool, Maniuch, Etc //Date cuenta que este es un arreglo de Strings y el otro es un arreglo de albms
    
    private Album[] albums;
    
    //*

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int year, int month, int day) {
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        
        this.fechaNacimiento = calendario.getTime();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int[] getDiscos() {
        return discos;
    }

    public void setDiscos(int[] discos) {
        this.discos = discos;
    }

    public String[] getConicertos() {
        return conicertos;
    }

    public void setConicertos(String[] conicertos) {
        this.conicertos = conicertos;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }
    
    //MetodoEqusl
    @Override
    public boolean equals(Object objeto){
        
        final Artista otroArtista = (Artista)objeto; //Esta wea aprendete de memoria, alv
        if(this.nombre.equals(otroArtista.nombre)){ //Voy comparando, si el nombre del artita[0] es igual al del artista [1] y ademas de eso
            if(this.fechaNacimiento.equals(otroArtista.fechaNacimiento)){ //La fecha del artista... y ademas de eso
                if(this.pais.equals(otroArtista.pais)){ //El pasi del artista....
                        return true; //Entonces, los artistas si son iguales
                }
            }  
        }
    
        return false;
    }
    
    @Override
    public String toString(){ //Sobreescribimos
     String artista = null ; //este es el estado inicial, lo vi del chalo que guardó todos los albums en una variable de tipo String 
        for(int i=0; i<albums.length; i++){ //Itera sobre el tamaño del album, 

            artista +=albums[i]+"\n"; // Y lo alamacena en la variable artista, Albums es un tipo de dato String en este metdo
        }
        
    return "Nombre: "+nombre+"\n"+"Fecha Nacimiento: "+fechaNacimiento+"\n"+pais+"\n"+artista; //Aqui retorna cada atributo,la variable album que la guardó en artista
    }
    
    
    
}
