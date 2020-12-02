package test10;
//Aqui tenemos que improtar
import java.util.*;

public class Datos {
    
    //1) Atriubtos
    private String nombre;
    private byte edad;
    private double peso;
    private Date fechaDeNacimiento;
    private char sexo; //M o F 
    //Vot a crear  una variable con arregglo para el test10_3
    private int [] numeroSalon; //aqui podría ser el 14, 15, 28..
    private String [] nombreroSalon; //Salón de clases dónde está ubicado el estudiante por ejemplo: "Tec o SMD";
    //Unidos los dos sería algo como.. Tec-24, SMD-23 , etc.
    private Materias [] materias; //Un arreglo de materias... Para el test_5
    private Direccion direccion;
    
    
    
    //Numero de cédula (hay que hacer validadción)
    //Materias(Estas tendrán nombre, numero, nivel (1-3))

    public Datos(String nombre, byte edad, double peso,int year,int month,int day, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        //Uso de Gregorian Calendar...
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        
        this.fechaDeNacimiento = calendario.getTime();
        this.sexo = sexo;
    }

    public Datos() { } //Constructor para estudiante 2

    //No hago un contructor para estudiante 3 ya que le voy a mandar la misma cantidad de parametros que el 1...pero por teclado...
    
    //....................................
    //Metodos Setter y Getter (s)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int year, int month, int day) {
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        
        this.fechaDeNacimiento = calendario.getTime();
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //***********************************

    public int[] getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(int[] numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public String[] getNombreroSalon() {
        return nombreroSalon;
    }

    public void setNombreroSalon(String[] nombreroSalon) {
        this.nombreroSalon = nombreroSalon;
    }
    
   //***************************************

    public Materias[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materias[] materias) {
        this.materias = materias;
    }
    //***************************************+


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

        //******************

  

    
    
    
    
}
