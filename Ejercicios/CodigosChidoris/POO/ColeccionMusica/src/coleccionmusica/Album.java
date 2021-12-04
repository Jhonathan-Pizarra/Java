/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica;


public class Album {
    
    private int anioLanzamiento;
    private String nombre;
    private int canciones; //Numero de canciones 
    private Genero genero;
    
    

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    @Override
    public String toString(){
    
        
    return "Año de lancamiento: "+anioLanzamiento+"\n"+"Nombre del Alubm: "+nombre+"\n"; //Este ta izzi, solo pones las varialbes que quieres que retorne
    }
    
}
