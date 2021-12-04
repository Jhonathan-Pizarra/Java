
//Clase usada para el Test 10_5
package test10;


public class Materias {
    
    private String nombre;
    private int nivel;
    private Fechas fechas; // No voy a usar esta, porque materias es un arreglo yo quiero solo hacer una abstraccion de un atributo no mas
    
    ///*********

    public Materias() { }
     
    //*******

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    //**********

    public Fechas getFechas() {
        return fechas;
    }

    public void setFechas(Fechas fechas) {
        this.fechas = fechas;
    }
    
    
}
