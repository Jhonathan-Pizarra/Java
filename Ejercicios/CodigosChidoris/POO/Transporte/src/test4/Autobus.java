
package test4;

public class Autobus {
    
    private double peso;
    private int ruedas;
    private String marca;
    //int pasajeros;
    private Pasajeros pasajeros; //Es un atributo de Auobus (Y ese atributo tiene otros atributos) 
    
    
    //*
    
    public Autobus() {}

  
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Pasajeros getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajeros pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
  public String toString(){
   
      return "Peso: "+this.peso+"\n"+
             "Ruedas: "+ruedas+"\n"+
             "Marca: "+marca+"\n"+
             "Informacion Pasajeros: "+"\n"+
             "Pasajeros: "+pasajeros+"\n";
  }
   
}
